package com.estruturaDeDados.aula1;

public class number1 {

   int v01[] = {1,2,3,4,5,6,7,8,9,10};
   int v02[] = {1,2,3,4,5,6,7,8,9,10};
   int v03[] = new int[10];

    public static void main(String[] args) {
        new number1();
    }

    public number1() {
        for(int i=0; i<v01.length; i++){
            v03[i] = (v01[i]  + v02[i])/2;
            System.out.println(v03[i]);
        }
    }
}
