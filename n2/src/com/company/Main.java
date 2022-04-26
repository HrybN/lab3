package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тьохзначне число: ");
        short num = scanner.nextShort();

        int n1;
        n1 = num / 100;

        int n2;
        n2 = (n1 * 100 - num) / 10*(-1);

        int n3;
        n3 = (n2 * 10 + n1 * 100 - num) * (-1);


        if(n1 > n2 && n1 > n3) {
            System.out.println("Найбільша цифра заданого числа: " + n1);
        }else if (n2 > n1 && n2 > n3) {
            System.out.println("Найбільша цифра заданого числа: " + n2);
        }else if (n3 > n1 && n3 > n2) {
            System.out.println("Найбільша цифра заданого числа: " + n3);
        }
    }
}
