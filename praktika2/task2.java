package org.example;

import java.util.Scanner;

public class praktika2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X: ");
        double x = scanner.nextDouble();

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        double sum = 0;
        double term = x;

        for (int k = 0; k <= n; k++) {
            sum += term;

            term = term * (-x * x) / ((2 * k + 2) * (2 * k + 3));
        }

        System.out.println("sin(" + x + ") ≈ " + sum);
    }
}
