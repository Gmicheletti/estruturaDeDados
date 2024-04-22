package com.estruturaDeDados.aulas.aula1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class number4 {
    int v01[] = new int[10];
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new number4();
    }

    public number4(){

        for(int i=0;  i<v01.length;  i++) {
            int numbRandom = random.nextInt(100)+1;
            v01[i] = numbRandom;
        }

        Arrays.sort(v01);

        int splitList = v01.length/2;

        for(int list: v01) {
            System.out.println(list);
        }

        int numberCenter = v01[splitList];

        System.out.println("Digite um número para saber o index: ");
        int input = scanner.nextInt();


        if(input == numberCenter){
            System.out.println("A posição do número é: " + splitList);
        } else if (input < numberCenter) {
            for(int i = 0; i < splitList; i++){
                if(input == v01[i]){
                    System.out.println("A posição do número é: " + i);
                }
            }
        } else if (input >  numberCenter) {
            for(int i=splitList; i<v01.length; i++){
                if(input == v01[i]){
                    System.out.println("A posição do número é: " + i);
                }
            }
        }

    }
}
