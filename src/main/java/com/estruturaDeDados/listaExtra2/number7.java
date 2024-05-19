package com.estruturaDeDados.listaExtra2;

import java.util.Scanner;

public class number7 {

    int linhas = 10;
    int colunas = 20;
    int vetor[][] = new int[linhas][colunas];
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new number7();
    }

    public number7(){
        for(int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Insira um número: ");
                vetor[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for(int a = 0; a < linhas; a++) {
                    for (int b = 0; b < colunas; b++) {
                        if(vetor[i][j] < vetor[a][b]){
                            int temp = vetor[i][j];
                            vetor[i][j] = vetor[a][b];
                            vetor[a][b] = temp;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(vetor[i][j] + " - ");
            }
        }


    }
}
