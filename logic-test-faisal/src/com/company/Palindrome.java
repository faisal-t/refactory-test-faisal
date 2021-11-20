package com.company;

public class Palindrome {
    public static void main(String[] args) {
        //palindrome test
        //Radar # --> palindrome
        //Malas # --> not palindrome

        String input = "Balonku ada lima";
        String inputResult = input.toLowerCase().trim();
        String result = "";

        for (int i = 0; i < inputResult.length()/2; i++) {
            int hurufAkhir = inputResult.length() - i - 1;
            if (inputResult.charAt(i) != inputResult.charAt(hurufAkhir)){
                result = "not palindrome";
            }
            else{
                result = "Palindrome";
            }
        }

        System.out.println(result);
    }
}
