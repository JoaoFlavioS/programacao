package com.unama;

import java.util.Scanner;

public class LetraD{
    public static void main(String args[]) {
        double raio;
        double perimetro;
        double area;
        double pi;
        pi = 3.14;
        Scanner Scanner;
        Scanner Sc = new Scanner(System.in);
        System.out.println("infrome o raio:");
        raio = Sc.nextDouble();
        area = ( pi*raio*2);
        System.out.println("A area e "+area);
        perimetro = 2*pi*raio;
        System.out.println("o perimetro e "+perimetro);
    }
}
