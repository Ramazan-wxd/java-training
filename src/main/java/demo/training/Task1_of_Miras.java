package demo.training;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Task1_of_Miras {
    public static void main(String[] args){
        int a[] = new int[15];
        for(int i=0; i<15; i++){
            Scanner in = new Scanner(System.in);
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i<15; i++){
            int counter=0;
            for(int j = 0; j<15; j++){
                if(a[j]==a[i]){
                    counter++;
                }
            }
            System.out.println(a[i]+" попадается "+counter+" раза");
            i=i+counter;


        }
}}
