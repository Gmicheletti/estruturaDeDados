package com.estruturaDeDados.listaExtra2;

import java.util.Scanner;

public class number3 {
    int vetor[] = new int[10];
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new number3();
    }

    public number3(){
        System.out.println("Insira um número:");
        vetor[0] = input.nextInt();
        if(vetor[0] % 2 == 0){
            vetor[1] = vetor[0] + 2;
        }else{
            vetor[1] = vetor[0] + 1;
        }

        for(int i = 2; i < vetor.length; i++){
            vetor[i] += vetor[i-1] + 2;
        }

        for(int item : vetor){
            System.out.print(item + " - ");
        }
    }
}
