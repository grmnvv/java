package com.company;

import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = in.nextInt();
        float avg = (float) (num1 + num2 + num3) / 3;
        System.out.print("Среднее арифметическое: ");
        System.out.print(avg);
    }

}
