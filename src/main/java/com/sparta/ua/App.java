package com.sparta.ua;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println(getRomanNumerals(159));
        System.out.println(getRoman(2000));
        getRoman3(600);
    }

    public static String getRomanNumerals(int number) {
        StringBuilder str = new StringBuilder();

        while (number != 0) {


            if (number - 1000 >= 0) {
                str.append("M");
                number -= 1000;
            } else if (number - 500 >= 0) {
                str.append("D");
                number -= 500;
            } else if (number - 100 >= 0) {
                str.append("C");
                number -= 100;
            } else if (number - 50 >= 0) {
                str.append("L");
                number -= 50;
            } else if (number - 10 >= 0) {
                str.append("X");
                number -= 10;
            } else if (number - 5 >= 0) {
                str.append("V");
                number -= 5;
            } else if (number - 1 >= 0) {
                str.append("I");
                number -= 1;
            }

        }
            return str.toString();

    }

    public static String getRoman(int number){
        StringBuilder str = new StringBuilder();
        String StringNum = String.valueOf(number);

        Map<String, String> myMap = new HashMap<>();
        myMap.put("1000","M");
        myMap.put("500","D");
        myMap.put("100","C");
        myMap.put("50","L");
        myMap.put("10","X");
        myMap.put("5","V");
        myMap.put("1","I");


        if(number % 1000 == 0){
            for(int i = 0; i < Integer.valueOf(StringNum.charAt(0));i++){
                str.append(myMap.get("1000"));
            }
        }

        return str.toString();
    }

    public static String getRoman3(int num){
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder str = new StringBuilder();

        for(int i=0;i<numbers.length;i++){
            while(num >= numbers[i]){
                num = num - numbers[i];
                str.append(romanNumerals[i]);
            }
        }
        return str.toString();
    }
}

