package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть напрям руху ліфта (число 1, якщо в гору; число 2, якщо вниз: ");
        int direction = scanner.nextByte();

        System.out.println("Введіть номер поверху: ");
        int floor = scanner.nextByte();

        if (direction == 1 && floor == 1) {
            System.out.println("Ви знаходитесь на " + floor + " поверсі");
            if (direction == 1 && floor == 1) {
                System.out.println("Ви знаходитесь на " + floor + " поверсі");
            }
            if (direction == 1 && floor == 2) {
                if (direction == 1 && floor == 3) {
                    System.out.println("Ви знаходитесь на " + floor + " поверсі");
                }
            }
            if (direction == 1 && floor == 4) {
                System.out.println("Ви знаходитесь на " + floor + " поверсі");
            }
            if (direction == 1 && floor == 5) {
                System.out.println("Ви знаходитесь на " + floor + " поверсі");
            }
            if (direction == 1 && floor == 6) {
                System.out.println("Ви знаходитесь на " + floor + " поверсі");
            }
            if (direction == 1 && floor == 7) {
                System.out.println("Ви знаходитесь на " + floor + " поверсі");
            }
            if (direction == 1 && floor == 8) {
                System.out.println("Ви знаходитесь на " + floor + " поверсі");
            }
            if (direction == 1 && floor == 9) {
                System.out.println("Ви знаходитесь на " + floor + " поверсі");
            }

            if (direction == 2 && floor == 1) {
                System.out.println("Ви знаходитесь на " + floor + " поверсі");
                if (direction == 2 && floor == 1) {
                    System.out.println("Ви знаходитесь на " + floor + " поверсі");
                }
                if (direction == 2 && floor == 2) {
                    if (direction == 2 && floor == 3) {
                        System.out.println("Ви знаходитесь на " + floor + " поверсі");
                    }
                }
                if (direction == 2 && floor == 4) {
                    System.out.println("Ви знаходитесь на " + floor + " поверсі");
                }
                if (direction == 2 && floor == 5) {
                    System.out.println("Ви знаходитесь на " + floor + " поверсі");
                }
                if (direction == 2 && floor == 6) {
                    System.out.println("Ви знаходитесь на " + floor + " поверсі");
                }
                if (direction == 2 && floor == 7) {
                    System.out.println("Ви знаходитесь на " + floor + " поверсі");
                }
                if (direction == 2 && floor == 8) {
                    System.out.println("Ви знаходитесь на " + floor + " поверсі");
                }
                if (direction == 2 && floor == 9) {
                    System.out.println("Ви знаходитесь на " + floor + " поверсі");
                }


            }
        }
    }
}