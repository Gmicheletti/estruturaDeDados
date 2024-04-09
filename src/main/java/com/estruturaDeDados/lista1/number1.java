package com.estruturaDeDados.lista1;

import java.util.Scanner;

public class number1 {
    int v1[] = new int[10];
    int par[] = new int[10];
    int impar[] = new int[10];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new number1();
    }

    public number1(){

        int countPar = 0;
        int countImpar = 0;

        for(int i=0; i<v1.length; i++){
            System.out.println("Insira um número: ");
            int input = scanner.nextInt();
            v1[i] = input;
        }

        for(int i=0; i<v1.length; i++) {
            if (v1[i] % 2 == 0) {
                par[countPar] = v1[i];
                countPar++;
            } else {
                impar[countImpar] = v1[i];
                countImpar++;
            }
        }

        System.out.println("Números Pares");
        for(int i=0; i<par.length; i++){
            if(par[i] > 0){
                System.out.println(par[i]);
            }
        }

        System.out.println("Números Impares");
        for(int i=0; i<impar.length; i++){
            if(impar[i] > 0) {
                System.out.println(impar[i]);
            }
        }



    }

}
