package com.estruturaDeDados.listaExtra2;

import java.util.Scanner;

public class number6 {
    int vetor[] = new int[10];
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new number6();
    }

    public number6(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Insira um número:");
            vetor[i] = input.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < i; j++){
                if(vetor[i] < vetor[j]){
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        System.out.print("Números pares: ");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0){
                System.out.print(vetor[i] + " - ");
            }
        }
        System.out.println();
        System.out.print("Números ímpares: ");
        for(int i = vetor.length - 1; i >= 0; i--){
            if(vetor[i] % 2 == 1){
                System.out.print(vetor[i] + " - ");
            }
        }
    }
}
