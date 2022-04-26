package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choise;
        System.out.println("Do you agree?" );
        choise = scanner.next();

        switch (choise) {
            case "Так":
                System.out.println("Я погоджуюсь!");
                break;
            case "OK":
                System.out.println("Я погоджуюсь!");
                break;
            case "Yes":
                System.out.println("Я погоджуюсь!");
                break;
            case "Y":
                System.out.println("Я погоджуюсь!");
                break;
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
                System.out.println("Я не погоджуюсь!");
                break;
            case "NO":
                System.out.println("Я не погоджуюсь!");
                break;
            case "N":
                System.out.println("Я не погоджуюсь!");
                break;
            case "-":
                System.out.println("Я не погоджуюсь!");
                break;
            case "No":
                System.out.println("Я не погоджуюсь!");
                break;

        }


    }
}
