package com.example.demo.training;

public class ArrayMax {
    public static void arrayMax() {

        int[] a = {7, 6, 3, 8, -7, 45, 422, 86775, 4566};
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
