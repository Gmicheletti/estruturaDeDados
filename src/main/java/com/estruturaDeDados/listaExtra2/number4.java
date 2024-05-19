package com.estruturaDeDados.listaExtra2;

import java.util.Random;
import java.util.Scanner;

public class number4 {
    int vetor[] = new int[100];
    Random random = new Random();

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new number4();
    }

    public number4(){

        for(int i=0;  i<vetor.length;  i++) {
            vetor[i] = random.nextInt(100)+1;
        }

//        for(int i = 0;  i < vetor.length; i++){
//            System.out.println("Insira um número: ");
//            vetor[i] = input.nextInt();
//        }

        for(int i = 0;  i < vetor.length; i++){
            if(i >= 10 && i<= 30){
                System.out.println(i + ": " + vetor[i]);
            }
        }
    }

}
