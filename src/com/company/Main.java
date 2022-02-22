package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int n = 0;
        int x = 10;
        int min = 0;
        int max = 2147483647;
        while ((n != 32) && (x != 2)) {
            System.out.println("Вы загадали число " + (max+min)/2 + "?");
            System.out.println("0) Нет, моё число больше.\n1) Нет, моё число меньше.\n2) Да");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            if (x == 0) {
                min = (max+min)/2;
                n = n + 1;
            }
            if (x == 1) {
                max = (max+min)/2;
                n = n + 1;
            }
            if (x == 2) {
                System.out.println("Машина опять оказалась умнее человека");
                break;
            }
        }
        if (n == 32) {
            System.out.println("Ничтожная машина не смогла отгадать ваше число");
        }
    }
}