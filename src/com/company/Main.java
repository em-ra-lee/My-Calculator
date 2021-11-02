package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        String el = sc.nextLine();
        String[] result = el.split(" ");

    if         (result[0].contains("I")     || result[2].contains("I") ||
                result[0].contains("II")    || result[2].contains("II") ||
                result[0].contains("III")   || result[2].contains("III") ||
                result[0].contains("IV")    || result[2].contains("IV") ||
                result[0].contains("V")     || result[2].contains("V") ||
                result[0].contains("VI")    || result[2].contains("VI") ||
                result[0].contains("VII")   || result[2].contains("VII") ||
                result[0].contains("VIII")  || result[2].contains("VIII") ||
                result[0].contains("IX")    || result[2].contains("IX") ||
                result[0].contains("X")     || result[2].contains("X")) {
            RomanNumeral rom1 = RomanNumeral.valueOf(result[0]);
            int a1 = rom1.getD();
            RomanNumeral rom2 = RomanNumeral.valueOf(result[2]);
            int b1 = rom2.getD();
            int r = a1 * b1, r1 = a1 / b1, r2 = a1 + b1, r3 = a1 - b1;
            if (el.contains("*")) {
                ArabianToRoman num1 = ArabianToRoman.valueOf("K" + r);
                String res = num1.getName();
                System.out.println("Output: \n" + res);}
            else if (el.contains("/")) {
                ArabianToRoman num1 = ArabianToRoman.valueOf("K" + r1);
                String res = num1.getName();
                System.out.println("Output: \n" + res);}
            else if (el.contains("+")) {
                ArabianToRoman num1 = ArabianToRoman.valueOf("K" + r2);
                String res = num1.getName();
                System.out.println("Output: \n" + res);}
            else if (el.contains("-")) {
                ArabianToRoman num1 = ArabianToRoman.valueOf("K" + r3);
                String res = num1.getName();
                System.out.println("Output: \n" + res);}
            else {System.out.println("Incorrect!");}
        }

        else {
            int a = Integer.parseInt(result[0]), b = Integer.parseInt(result[2]);
            int r = a * b, r1 = a / b, r2 = a + b, r3 = a - b;
            if (a <= 10 && b <= 10 && el.contains("*")) {
                System.out.println("Output: \n" + r);}
            else if (a <= 10 && b <= 10 && el.contains("/")) {
                System.out.println("Output: \n" + r1);}
            else if (a <= 10 && b <= 10 && el.contains("+")) {
                System.out.println("Output: \n" + r2);}
            else if (a <= 10 && b <= 10 && el.contains("-")) {
                System.out.println("Output: \n" + r3);}
            else {System.out.println("Incorrect!");}
        }
    }
}
