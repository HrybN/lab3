package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        short num = scanner.nextShort();

        if (num > 25 && num < 100) {
            System.out.println("Число " + num + " міститься в проміжку (25;100)");
        }
        else {
            System.out.println("Число " + num + " НЕ міститься в проміжку (25;100)");
        }
    }
}
