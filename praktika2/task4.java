package org.example;

import java.util.Scanner;

public class praktika2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите A: ");
        double a = scanner.nextDouble();
        System.out.print("введите B: ");
        double b = scanner.nextDouble();
        double min = 0;
        double max = 0;
        if (a < b){
            max = b;
            min = a;
            System.out.println(a + " " + b);

        } else {
            max = a;
            min = b;
            System.out.println(b + " " + a);
        }
        int c = (int) Math.ceil(max);
        int d = (int) Math.floor(min);
        System.out.println(c + ">=" + max + ">" + min + ">=" + d);
        }
    }

