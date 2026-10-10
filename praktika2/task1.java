package org.example;

import java.util.Scanner;

public class praktika2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите A: ");
        int a = scanner.nextInt();

        System.out.print("введите B: ");
        int b = scanner.nextInt();

        int count = 0;

        System.out.println("числа от B до A по убыванию:");

        for (int i = b; i >= a; i--) {
            System.out.print(i + " ");
            count++;
        }

        System.out.println();
        System.out.println("колво чисел: " + count);
    }
}
