package demo.training;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for(int i=0; i<10; i++){
            Scanner in = new Scanner(System.in);
            a[i]=in.nextInt();
        }
        int counter = 0;
        for(int i: a){
            int count = 0;

            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+" - простое число");
                counter++;
            }
        }
        System.out.printf("найдено %d простых чисел", counter);
    }
}
