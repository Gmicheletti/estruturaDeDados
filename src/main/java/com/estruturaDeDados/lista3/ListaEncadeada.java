package com.estruturaDeDados.lista3;

public class ListaEncadeada {
    Nodo inicio;
    int tamanho;

    public ListaEncadeada(){
        inicio = null;
        tamanho = 0;
    }

    public void insereInicio(int val){
        Nodo nodo = new Nodo();
        nodo.val = val;
        nodo.prox = inicio;
        inicio = nodo;
        tamanho++;
    }
    public void inserirFim(int val){
        Nodo nodo = new Nodo();
        nodo.val = val;
        if(inicio == null){
            nodo.prox = null;
            inicio = nodo;
        }else{
            Nodo aux = inicio;
            while (aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = nodo;
            nodo.prox = null;
        }
        tamanho++;
    }
    public void inserirPosicao(int index, int val){
        if(index <= 0){
            insereInicio(val);
        }else if(index >= tamanho){
            inserirFim(val);
        }else{
            Nodo aux = inicio;
            for(int i = 0; i < index -1; i++){
                aux = aux.prox;
            }
            Nodo nodo = new Nodo();
            nodo.val = val;
            nodo.prox = aux.prox;
            aux.prox = nodo;
            tamanho++;
        }
    }

    public int removeInicio(){
        if(inicio == null){
            return -1;
        }
        int info = inicio.val;
        inicio = inicio.prox;
        tamanho--;
        return info;
    }
    public int removeFim(){
        if(inicio == null){
            return -1;
        }else{
            Nodo aux = inicio;
            while (aux.prox.prox != null){
                aux = aux.prox.prox;
            }
            int temp = aux.val;
            aux.prox = null;
            tamanho--;
            return temp;
        }
    }
    public int removePosicao(int index){
        if(index < 0 || index > tamanho || inicio == null){
            return -1;
        }else if(index == 0){
            return removeInicio();
        } else if (index == tamanho -1) {
            return removeFim();
        }
        Nodo aux = inicio;
        for(int i = 0; i < index -1; i++){
            aux = aux.prox;
        }
        int temp = aux.val;
        aux.prox = aux.prox.prox;
        tamanho--;
        return temp;

    }
    public int removerElemento(int elemento){
        if(inicio == null){
            return -1;
        }

        if(inicio.val == elemento){
            removeInicio();
        }

        Nodo aux = inicio;
        while (aux.prox != null && aux.prox.val != elemento){
            aux = aux.prox;
        }

        if(aux.prox == null){
            return -1;
        }

        int temp = aux.val;
        aux.prox = aux.prox.prox;
        tamanho--;
        return temp;
    }

    public void getLista(){
        System.out.println();
        Nodo aux = inicio;
        for(int i = 0; i < tamanho; i++){
            System.out.print(aux.val + ", ");
            aux = aux.prox;
        }
    }
    public void getElemento(int elemento){
        int count = 0;
        Nodo aux = inicio;
        while (aux != null && aux.val != elemento){
            aux = aux.prox;
            count++;
        }
        if(aux == null){
            System.out.println("Elemento não encontrado na lista");
        }
        System.out.println();
        System.out.println("O elemento " + elemento + " está na posição " + count);
    }
    public void getTamanhoLista(){
        System.out.println("O tamanho da lista é " + tamanho);
    }

}
