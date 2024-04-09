package com.estruturaDeDados.aula1;

import java.util.Random;

public class number5 {
    int v01[] = new int[10];
    Random random = new Random();
    int countCrescente = 0;
    int countDecrescente = 0;
    public static void main(String[] args) {
       new number5();
    }

    public number5(){
        for (int i = 0; i < v01.length; i++){
            int numbRandon = random.nextInt(100)+1;
            v01[i] = numbRandon;
            System.out.print(v01[i] + " - ");
        }

        for(int i = 0; i < v01.length; i++){
            for(int j = 0; j < i; j++){
                if(v01[i] < v01[j]){
                    int temp = v01[i];
                    v01[i] = v01[j];
                    v01[j] = temp;
                    countCrescente++;
                }
            }
        }


        for(int i = 0; i < v01.length; i++){
            for(int j = 0; j < i; j++){
                if(v01[i] > v01[j]){
                    int temp = v01[i];
                    v01[i] = v01[j];
                    v01[j] = temp;
                    countDecrescente++;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < v01.length; i++){
            System.out.print(v01[i] + " - ");
        }
        System.out.println();
        System.out.println("Crescente: " + countCrescente + " trocas");
        System.out.println("Decrescente: " + countDecrescente + " trocas");
        System.out.println();

    }
}
