package com.example.demo.training;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String word1 = in.nextLine().toLowerCase();

        System.out.println("Введите второе слово:");
        String word2 = in.nextLine().toLowerCase();

        if(word1.length()==word2.length()){
            int c = word1.length();
            char a[] = word1.toCharArray();
            int counter=0;
            for(int i=0; i<c; i++){
                if(word2.contains(String.valueOf(a[i]))){
                    counter++;
                }
            }
            if(counter==word1.length()){
                System.out.println("this is anagram");
            }
            else{System.out.println("this is not anagram");}
        }
        else{System.out.println("this is not anagram");
    }
}}
