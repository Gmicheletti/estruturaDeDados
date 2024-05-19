package com.estruturaDeDados.listaExtra2;

import java.util.Random;

public class number10 {

    int linha = 4;
    int coluna = 4;
    int vetor[][] = new int[linha][coluna];
    Random random = new Random();

    public static void main(String[] args) {
        new number10();
    }

    public number10(){

        int maior = -1;
        int indexLinha = 0;
        int indexColuna = 0;

        for(int i = 0; i < linha; i++){
            System.out.println();
            for(int j = 0; j < coluna; j++){
                vetor[i][j] = random.nextInt(9)+1;
                System.out.print(vetor[i][j] + " ");
                if(vetor[i][j] > maior){
                    maior = vetor[i][j];
                    indexLinha = i;
                    indexColuna = j;
                }
            }
        }

        System.out.println();
        System.out.println("O maior número é: " + maior);
        System.out.println("Linha: " + indexLinha);
        System.out.println("Coluna: " + indexColuna);

    }
}
