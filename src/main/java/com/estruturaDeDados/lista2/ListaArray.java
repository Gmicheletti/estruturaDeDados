package com.estruturaDeDados.lista2;

public class ListaArray {
    int vetor[];
    int ultimo;

    public ListaArray(){
        this.vetor = new int[10];
        this.ultimo = -1;
    }

    public void insereInicio(int v){
        if(this.ultimo == -1){
            vetor[0] = v;
            ultimo++;
        } else{
            for(int i = ultimo; i >= 0; i--){
                vetor[i+1] = vetor[i];

                if(ultimo == vetor.length){
                    int[] aux = new int[vetor.length];
                    for(int j = 0; j < vetor.length; j++){
                        aux[j]=vetor[j];
                    }
                    this.vetor = new int[vetor.length * 2];
                }

            }

            vetor[0] = v;
        }
    }

    public int removeP(int pos){
        if(pos > ultimo || pos < 0){
//            ERRO
        }else{
            int aux = vetor[pos];
            vetor[pos] = 0;
        }
        return pos;
    }

}


