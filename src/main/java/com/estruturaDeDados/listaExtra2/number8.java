package com.estruturaDeDados.listaExtra2;

import java.util.Random;
import java.util.Scanner;

public class number8 {
    int linha = 12;
    int coluna = 12;
    int vetor[][] = new int[linha][coluna];
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    String opcao;

    public static void main(String[] args) {
        new number8();
    }

    public number8(){
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                vetor[i][j] = random.nextInt(9)+1;
            }
        }

        for(int i = 0; i < linha; i++){
            System.out.println();
            for(int j  = 0; j < coluna; j++){
                System.out.print(vetor[i][j] + " ");
            }
        }
        opcaoMenu();
    }

    private void opcaoMenu() {
        System.out.println();
        System.out.println("Escolha uma opção: ");
        System.out.println("S = soma, M = média");
        opcao = input.next();

        if(opcao.equals("S") || opcao.equals("s")){
            System.out.println("Soma: " + soma());
        }else if(opcao.equals("M") || opcao.equals("m")){
            System.out.println("Media: " + media());
        }else{
            System.out.println("Opção inválida, escolha uma opção válida: ");
            opcaoMenu();
        }
    }

    private int soma(){
        int valorSoma = 0;
        for(int i = 0; i < linha; i++){
            for(int j  = 0; j < coluna; j++){
                valorSoma += vetor[i][j];
            }
        }
        return valorSoma;
    }

    private float media(){
        float valorSomaMedia = 0;
        int count = 0;
        for(int i = 0; i < linha; i++){
            for(int j  = 0; j < coluna; j++){
                valorSomaMedia += vetor[i][j];
                count++;
            }
        }
        return valorSomaMedia/count;
    }


}
