package com.company;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args){
        final float pi = (float) 3.141;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        int r = in.nextInt();
        float square = pi * (float) Math.pow(r, 2);
        System.out.print("Площадь круга равна: ");
        System.out.print(square);
    }

}
