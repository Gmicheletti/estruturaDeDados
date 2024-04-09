package com.estruturaDeDados.lista1;

import java.util.Scanner;

public class number2 {
    float v1[] = new float[10];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new number2();
    }

    public number2(){

        for(int i=0; i<v1.length; i++){
            System.out.println("Insira um número");
            float input = scanner.nextInt();

            v1[i] = input;
        }

        for(int i=0; i<v1.length; i++){
            System.out.println(i + "+" + v1[i] + "/" + "2" + "=" + (i+v1[i])/2);
        }

    }

}
