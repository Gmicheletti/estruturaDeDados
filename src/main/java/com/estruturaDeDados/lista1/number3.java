package com.estruturaDeDados.lista1;

import java.util.Scanner;

public class number3 {
    int v01[] = new int[10];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new number3();
    }

    public number3(){
        System.out.println("Insira um número: ");
        int input = scanner.nextInt();
        v01[0] = input;
        System.out.println(v01[0]);

        for(int i = 1; i < v01.length; i++ ){
            v01[i] = v01[i - 1] * 2;
            System.out.println(v01[i]);
        }

    }
}
