package com.company;

public class LeapYear {
    public static void main(String[] args) {
        int year1 = 1900;
        int year2 = 2020;

        for (int i = year1; i <= year2; i++) {
            String a = String.valueOf(i);
            if(a.charAt(2) == '0' && a.charAt(3) == '0' && i % 400 != 0){
                //pengecekan lanjutan untuk tahun kabisat
                //System.out.println(i);
            }
            else if (i % 4 == 0 || i % 100 == 0 || i % 400 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
