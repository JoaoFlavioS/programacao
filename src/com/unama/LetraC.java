package com.unama;

import java.util.Scanner;

public class LetraC {
    public static void main(String args[]) {
        double base;
        double altura;
        double area;
        Scanner Scanner;
        Scanner Sc = new Scanner (System.in);
        System.out.println("infome a base:");
        base = Sc.nextDouble();
        System.out.print("informe a altura:");
        altura = Sc.nextDouble();
        area = (base*altura/2);
        System.out.println("a area e : "+area );

    }
}
