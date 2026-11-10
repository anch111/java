package org.example;

import java.util.Scanner;

public class praktika2 {

    static Scanner scanner = new Scanner(System.in);

    static void showMenu() {
        System.out.println("\n===== ГЛАВНОЕ МЕНЮ =====");
        System.out.println("1. Выполнить расчёт площади треугольника");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите пункт: ");
    }

    static void showProgramInfo() {
        System.out.println("\n--- О программе ---");
        System.out.println("Программа вычисляет площадь прямоугольного треугольника.");
        System.out.println("Формула: S = a * h / 2");
        System.out.println("где a — основание, h — высота.");
    }

    static void showDeveloperInfo() {
        System.out.println("\n--- О разработчике ---");
        System.out.println("Разработчик: Зенкина Анна");
        System.out.println("Группа: РИ-250931");
        System.out.println("Год: 2026");
    }

    static void calculateArea() {
        System.out.println("\n--- Расчёт площади прямоугольного треугольника ---");

        double a = 0;
        while (true) {
            System.out.print("Введите основание (a > 0): ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                if (a > 0) break;
                System.out.println("Число должно быть больше нуля!");
            } else {
                System.out.println("Вы ввели не число!");
                scanner.next();
            }
        }
    
        double h = 0;
        while (true) {
            System.out.print("Введите высоту (h > 0): ");
            if (scanner.hasNextDouble()) {
                h = scanner.nextDouble();
                if (h > 0) break;
                System.out.println("Число должно быть больше нуля!");
            } else {
                System.out.println("Вы ввели не число!");
                scanner.next();
            }
        }
    
        double s = a * h / 2;
        System.out.println("Площадь прямоугольного треугольника равна " + s);
        }



    public static void main(String[] args) {
        System.out.println("Привет. Это программа для вычисления площади прямоугольного треугольника.");

        while (true) {
            showMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("Нужно ввести число от 1 до 4!");
                scanner.next();
                continue;
            }

            int command = scanner.nextInt();

            switch (command) {
                case 1 -> {
                    calculateArea();
                }
                case 2 -> {
                    showProgramInfo();
                }
                case 3 -> {
                    showDeveloperInfo();
                }
                case 4 -> {
                    System.out.println("Пока!");
                    return;
                }
                default -> {
                    System.out.println("Неверный пункт меню! Введите число от 1 до 4.");
                }
            }
        }
    }
}
