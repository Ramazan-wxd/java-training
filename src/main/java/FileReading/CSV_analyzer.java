package FileReading;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSV_analyzer {
    public static void main(String[] args) throws FileNotFoundException {
        Path pathIn = Paths.get("C:\\Users\\Asus\\OneDrive\\Documents\\projects\\java-training-master\\src\\main\\java\\FileReading\\orders.csv");
        Path pathOut = Paths.get("C:\\Users\\Asus\\OneDrive\\Documents\\projects\\java-training-master\\src\\main\\java\\FileReading\\report.txt");

        String L;
        Function<String, Optional<Order>> parseLine = line -> {
                String[] col = line.split(",");
                if (col.length != 3) {
                    System.err.println("Ошибка в строке: " + line);
                    return Optional.empty();
                }

                String idStr = col[0].trim();
                String product = col[1].trim();
                String quantityStr = col[2].trim();
                if(idStr.isEmpty() || product.isEmpty() || quantityStr.isEmpty()) {
                    System.err.println("Пустые поля в строке: " + line);
                    return Optional.empty();
                }
                try {
                    long id = Long.parseLong(idStr);
                    int quantity = Integer.parseInt(quantityStr);
                    return Optional.of(new Order(id, product, quantity));
                }
                catch (NumberFormatException e) {
                    System.err.println("Ошибка данных в поле(не число): " + line);
                    return Optional.empty();
                }
            };
        CsvParser<Order> parser = new CsvParser<>();
        List<Order> orders = parser.parse(pathIn, parseLine);

        Summarizer summarizer = new Summarizer();
        Map<String, List<Order>> Products = summarizer.summarize(orders);

        Summarizer Qsum = new Summarizer();
        Map<String, Integer> quantitySum = Qsum.sumQuantities(orders);



        try(BufferedWriter writer = Files.newBufferedWriter(pathOut)) {
            writer.write("Отчет по заказам:\n");
            for(Map.Entry<String, Integer> entry : quantitySum.entrySet()){
                writer.write("Товар: " + entry.getKey() + ", заказов: " + entry.getValue() + "\n");

            }
            writer.newLine();
            writer.write("Топ 3 по количеству заказов:\n");
            quantitySum.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(3)
                    .forEach(entry -> {
                        try {
                            writer.write("Товар: " + entry.getKey() + ", заказов: " + entry.getValue() + "\n");
                        } catch (IOException e) {
                            System.err.println("Ошибка записи в файл: " + e.getMessage());
                        }
                    });


        }
        catch (IOException e){
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }


            }

        }


class Order {
    private long id;
    private String product;
    private int quantity;

    Order(long id, String product, int quantity) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

interface Summarizable<T>{
    Map<String, List<T>> summarize(List<T> items);
    Map<String, Integer> sumQuantities(List<T> items);
}
class Summarizer<T> implements Summarizable<Order> {
    public Map<String, List<Order>> summarize(List<Order> items) {
        return items.stream().collect(
                Collectors.groupingBy(
                        Order::getProduct));
    }

    public Map<String, Integer> sumQuantities(List<Order> items){
        return items.stream().collect(
                Collectors.groupingBy(
                        Order::getProduct,
                        Collectors.summingInt(Order::getQuantity)
                )
        );
    }
}

class CsvParser<T>{
    public List<T> parse(Path path, Function<String, Optional<T>> lineParser) {
        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .map(lineParser)
                    .flatMap(Optional::stream)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
            return List.of();
        }
    }
}

