package com.estruturaDeDados.listaExtra2;

import java.util.Scanner;

public class number5 {
    int vetor[] = new int[20];
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        new number5();
    }

    public number5(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Insira um número: ");
            vetor[i] = input.nextInt();
        }

        for(int i = vetor.length -1; i >= 0; i--){
            System.out.print(vetor[i] + " - ");
        }
    }
}
