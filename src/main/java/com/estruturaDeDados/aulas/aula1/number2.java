package com.estruturaDeDados.aulas.aula1;
import java.util.Random;

public class number2 {
    int v01[] = new int[100];
    int v02[] = new int[50];

    public static void main(String[] args) {
        new number2();
    }

    public number2(){
        int min = 101;
        int sum = 0;

        for(int i=0; i <v01.length; i++){
            Random random = new Random();
            int numbRandom = random.nextInt(100)+1;
            v01[i] = numbRandom;
            System.out.print(v01[i] + " - ");

            sum += v01[i];

            if(v01[i] < min) {
                min = v01[i];
            }
        }
        System.out.println();
        System.out.println("Menor número: " + min);
        System.out.println("Soma de todos os números: " + sum);
        System.out.println();

        for(int i=0; i<v02.length; i++){
            int tamanho = v01.length - 1;
            int j = tamanho - i;
            v02[i] = v01[i] + v01[j];
            System.out.println(v01[i] + " + " + v01[j] + " = " + v02[i]);
        }
    }
}
