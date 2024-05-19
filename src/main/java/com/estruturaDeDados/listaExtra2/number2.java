package com.estruturaDeDados.listaExtra2;

import java.util.Scanner;

public class number2 {
    int vetor[] = new int[3];
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new number2();
    }

    public number2(){
        for(int i = 0;  i < vetor.length; i++){
            System.out.println("Insira um número: ");
            vetor[i] = input.nextInt();
        }

        for(int i = 0;  i < vetor.length; i++){
            for(int j = 0;  j < i; j++){
                if(vetor[i] < vetor[j]){
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        for(int item : vetor){
            System.out.print(item + " - ");
        }


    }
}
