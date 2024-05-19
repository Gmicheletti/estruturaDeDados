package com.estruturaDeDados.listaExtra2;

import java.util.Scanner;

public class number1 {
    int tamanhoTurma = 10;
    String alunos[] = new String[tamanhoTurma];
    int notas[] = new int[tamanhoTurma];
    int somaNotas = 0;
    float mediaTurma = 0;
    Scanner inputNome = new Scanner(System.in);
    Scanner inputNota = new Scanner(System.in);

    public static void main(String[] args) {
        new number1();
    }

    public number1(){

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Nome aluno: ");
            alunos[i] = inputNome.next();

            System.out.println("Nota aluno: ");
            notas[i] = inputNota.nextInt();
        }


        for (int nota : notas) {
            somaNotas += nota;
        }

        mediaTurma = (float) somaNotas / alunos.length;

        System.out.println("Média da turma: " + mediaTurma);
        System.out.println();
        System.out.println("Alunos acima da média: ");
        for(int i = 0; i < alunos.length; i++){
            String aluno = alunos[i];
            int nota = notas[i];

            if(nota > mediaTurma){
                System.out.println(aluno + ": " + nota);
            }
        }

    }
}




