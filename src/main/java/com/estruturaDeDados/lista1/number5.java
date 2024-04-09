package com.estruturaDeDados.lista1;

import java.util.Scanner;

public class number5 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new number5();
    }

    public number5(){
        System.out.println("Insira um número: ");
        int input = scanner.nextInt();
        int result;

        if(input <= 0){
            result = 0;
        } else if (input == 1) {
            result = 1;
        }else{
            int a = 0;
            int b = 1;
            for (int i = 3; i<= input; i++){
                int temp = b;
                b = a + b;
                a = temp;
            }
            result = b;
        }
        System.out.println(result);
    }
}
