package com.estruturaDeDados.aula1;
import java.util.Scanner;

public class number3 {
    int vi[] = new int[5];
    int vp[] = new int[5];
    int countVI = 0;
    int countVP = 0;



    public static void main(String[] args) {
        new number3();
    }

    private number3(){
        for( int i=0; i<10; i++){

            int countSobra = 10 - i;
            int input;

            if(countVI == 5){
                System.out.println("Os números impares foram todos preenchidos");
                System.out.println("Digite números pares");
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
            } else if (countVP == 5) {
                System.out.println("Os números pares foram todos preenchidos");
                System.out.println("Digite números impares");
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
            }else{
                System.out.println("Digite "  + countSobra + " números");
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
            }


            if(input % 2 == 0){
                vp[countVP] = input;
                countVP++;
            }else{
                vi[countVI] = input;
                countVI++;
            }


        }
        System.out.println("Números Impares");
        for(int i=0; i<vi.length; i++){
            System.out.println(vi[i]);
        }

        System.out.println("Números Pares");
        for(int i=0; i<vp.length; i++){
            System.out.println(vp[i]);
        }

    }
}
