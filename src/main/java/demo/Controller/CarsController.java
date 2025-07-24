package demo.Controller;
import demo.models.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Transport/Cars")
public class CarsController {
    @GetMapping
    public List<Books> showCars(){
    return List.of(
            Books.builder().id(1).mark("Mercedes").model("Benz").build(),
        Books.builder().id(2).mark("Mustand").model("AMV").cost(7000).build()
        );

    }
}
