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

        double a = readPositiveDouble("Введите основание (a > 0): ");
        double h = readPositiveDouble("Введите высоту (h > 0): ");

        double s = a * h / 2;
        System.out.println("Площадь прямоугольного треугольника равна " + s);
    }


    static double readPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Число должно быть больше нуля! Попробуйте снова.");
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Ввод отменён.");
                    return -1;
                }
                System.out.println("Вы ввели не число! Попробуйте снова (или введите 'exit' для отмены).");
            }
        }
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
