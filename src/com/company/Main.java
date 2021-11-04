package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.println("Input:");
        String el = sc.nextLine(); String[] result = el.split(" ");

        if  (result[0].matches(".*[IVX].*") || result[2].matches(".*[IVX].*")){
            Roman rom1 = Roman.valueOf(result[0]);
            Roman rom2 = Roman.valueOf(result[2]);
            int a1 = rom1.getD(), b1 = rom2.getD();
            int r = a1 * b1, r1 = a1 / b1, r2 = a1 + b1, r3 = a1 - b1;
            if (el.contains("*") || el.contains("/") || el.contains("+") || el.contains("-")) {
                int res = el.contains("*") ? r : el.contains("/") ? r1 : el.contains("+") ? r2 : r3;
                System.out.println("Output: \n" + Arabian.valueOf("K" + res).getName());}
            else {System.out.println("Incorrect!");}}
        else {
            int a = Integer.parseInt(result[0]), b = Integer.parseInt(result[2]);
            int r = a * b, r1 = a / b, r2 = a + b, r3 = a - b;
            if (el.contains("*") && a <= 10 && b <= 10 || el.contains("/") && a <= 10 && b <= 10 || el.contains("+") && a <= 10 && b <= 10 || el.contains("-") && a <= 10 && b <= 10) {
                int res = el.contains("*") ? r : el.contains("/") ? r1 : el.contains("+") ? r2 : r3;
                System.out.println("Output: \n" + res);}
            else {System.out.println("Incorrect!");}}
    }
}
