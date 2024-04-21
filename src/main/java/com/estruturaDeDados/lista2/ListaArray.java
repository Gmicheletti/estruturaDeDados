package com.estruturaDeDados.lista2;

public class ListaArray {
    int vetor[];
    int ultimo;

    public ListaArray(){
        this.vetor = new int[10];
        this.ultimo = -1;
    }
    public void duplicaTamanho(){
        int[] aux = new int[vetor.length];
        for(int j = 0; j < vetor.length; j++){
            aux[j]=vetor[j];
        }
        this.vetor = new int[vetor.length * 2];
    }


    public void insereInicio(int v){
        if(ultimo == -1){
            vetor[0] = v;
            ultimo++;
        } else{
            for(int i = ultimo; i >= 0; i--){
                vetor[i+1] = vetor[i];
                if(ultimo == vetor.length) {
                    duplicaTamanho();
                }
            }

            vetor[0] = v;
            ultimo++;
        }
    }
    public void insereFim(int v){
        if(ultimo == -1) {
            vetor[0] = v;
            ultimo++;
        }else{
            vetor[ultimo + 1] = v;
            if(ultimo == vetor.length) {
                duplicaTamanho();
            }
            ultimo++;
        }

    }
    public void inserePosicao(int pos, int v){
        if(ultimo == -1){
            vetor[0] = v;
        }else{
            for(int i = ultimo; i >= pos; i--){
                vetor[i + 1] = vetor[i];
            }
            vetor[pos] = v;
            ultimo++;
        }
    }


    public int removeInicio(){
        int aux = vetor[0];
        for(int i = 0; i <= ultimo; i++) {
            vetor[i] = vetor[i + 1];
        }
        ultimo--;
        return aux;
    }
    public int removeFim(){
        int aux = vetor[ultimo];
        ultimo--;
        return aux;
    }
    public int removePosicao(int pos){
        int aux = vetor[pos];
        if(pos > ultimo || pos < 0){
//            ERRO
        }else{
            for(int i = pos; i <= ultimo; i++){
                vetor[i] = vetor[i+1];
            }
            ultimo--;
        }
        return aux;
    }
    public int removeElemento(int elemento){
        int aux = elemento;
        for(int i = 0; i <= ultimo; i++){
            if(vetor[i] == elemento){
                for(int j = vetor[i]; j <= ultimo; j++){
                    vetor[i] = vetor[i+1];
                }
            }
        }
        ultimo--;
        return elemento;
    }


    public void getLista(){
        System.out.println("");
        for(int i = 0; i <= ultimo; i++){
            System.out.print(vetor[i] + ", ");
        }
    }
    public int getElemento(int elemento){
        int resultPosicao = 0;
        for(int i = 0 ; i <= ultimo;  i++){
            if(vetor[i] == elemento){
                resultPosicao = i;
            }else{
                resultPosicao = 0;
            }
        }
        if (resultPosicao > 0){
            return resultPosicao;
        }else{
            System.out.println();
            System.out.println("Elemento " + elemento + " não existe");
            return resultPosicao;
        }

    }
    public int getCountLista(){
        int count = 0;
        for(int i = 0; i <= ultimo; i++){
                count++;
        }
        return count;
    }

}


