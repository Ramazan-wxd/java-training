package demo.training;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Double a = in.nextDouble();
        String operation= in.next();
        Double b = in.nextDouble();

        switch(operation){
            case "+":
                System.out.println(" = " + (a+b));
                break;
            case "-":
                System.out.println(" = " + (a-b));
                break;
            case "*":
                System.out.println(" = " + (a*b));
                break;
            case "/":
                System.out.println(" = " + (a/b));
                break;
            default:
                System.out.println("type an appropriate operation symbol");
                break;
    }
}}
