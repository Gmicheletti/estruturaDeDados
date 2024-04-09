package com.estruturaDeDados.lista1;

import java.util.Scanner;

public class number4 {
    float v01[] = new float[100];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new number4();
    }

    public number4(){
        System.out.println("Insira um número");
        float input = scanner.nextFloat();

        v01[0] = input;
        System.out.println(v01[0]);

        for(int i = 1; i < v01.length; i++){
            v01[i] = v01[i - 1]/2;
            System.out.println(v01[i]);
        }
    }
}
