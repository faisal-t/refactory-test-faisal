package com.company;

public class ReverseWords {
    public static void main(String[] args) {
        String words = "I am A Great human";
        String arrWords[] = words.split(" ");
        String reverseWords = "";
        for (int i = 0; i < arrWords.length; i++) {
            int a = Integer.parseInt(String.valueOf(arrWords[i].length()));
            if (a < 1){
                reverseWords += " " + arrWords[i];
            }else{
                String temp = "";
                for (int j = a - 1; j >= 0; j--) {
                    if (a > 1 && j == a - 1 && Character.isUpperCase(arrWords[i].charAt(0))){
                        arrWords[i] = Character.toLowerCase(arrWords[i].charAt(0)) + arrWords[i].substring(1);
                        temp += Character.toUpperCase(arrWords[i].charAt(j));
                    }
                    else{
                        temp += arrWords[i].charAt(j);
                    }

                }
                reverseWords += " " + temp;
            }
        }

        System.out.println(reverseWords);
    }
}
