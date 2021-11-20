package com.company;

import java.util.ArrayList;

public class NearestFibonacci {
    public static void main(String[] args) {
        int arr[] = {15,1,3};
        int count = arr[0] + arr[1] + arr[2];
        ArrayList<Integer> fibo = new ArrayList<>();

        int limit=10, past, current, fibonacci;
        past = 1;
        current = 1;
        fibonacci = 1;
        for (int i =1; i <= limit; i++){
            fibonacci = past + current;
            past = current;
            current = fibonacci;
            if (fibonacci > count){
                fibo.add(fibonacci);
            }
        }

        System.out.println(fibo.get(0) - count);
    }
}
