package demo.training;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String word1 = in.nextLine().toLowerCase();

        System.out.println("Введите второе слово:");
        String word2 = in.nextLine().toLowerCase();

        if(word1.length()==word2.length()){
            char w1[] = word1.toCharArray();
            char w2[] = word2.toCharArray();
            Arrays.sort(w1);
            Arrays.sort(w2);
            if(Arrays.equals(w1, w2)){
                System.out.println("this is anagram");
            }
            else{System.out.println("this is not anagram");}
        }
        else{System.out.println("this is not anagram");
    }
}}
