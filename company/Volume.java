package com.company;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args){
        final float pi = (float) 3.141;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус цилиндра: ");
        int r = in.nextInt();
        System.out.println("Введите высоту цилиндра: ");
        int h = in.nextInt();
        float volume = pi * (float)Math.pow(r, 2) * h;
        float square = 2 * pi * r * (r + h);
        System.out.print("Объем цилиндра: ");
        System.out.println(volume);
        System.out.print("Площадь цилиндра: ");
        System.out.println(square);
    }
}
