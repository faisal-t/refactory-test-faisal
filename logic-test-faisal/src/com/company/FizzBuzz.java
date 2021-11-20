package com.company;

import java.util.ArrayList;

public class FizzBuzz {



    public static void main(String[] args) {
        //    answer[i] == "FizzBuzz" // if i is divisible by 3 and 5.
        //    answer[i] == "Fizz" // if i is divisible by 3.
        //    answer[i] == "Buzz" // if i is divisible by 5.
        //    answer[i] == i // if non of the above conditions are true.
        //    result dalam bentuk array
        ArrayList<String> list = new ArrayList<>();
        int input = 15;

        for (int i = 1; i <= input; i++) {
            if (i % 5 == 0 && i % 3 == 0){
                list.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                list.add("Fizz");
            }
            else if (i % 5 == 0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        

        System.out.println(list);
    }
}
