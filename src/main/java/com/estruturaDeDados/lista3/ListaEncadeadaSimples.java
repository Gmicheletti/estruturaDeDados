package com.estruturaDeDados.lista3;

public class ListaEncadeadaSimples {
    Nodo inicio;
    int tamanho;

    public ListaEncadeadaSimples(){
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
            for(int i = 0; i < index; i++){
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
        Nodo aux = inicio;
        while (aux.val != elemento){
            aux = aux.prox;
        }
        int temp = aux.val;
        aux.prox = aux.prox.prox;
        tamanho--;
        return temp;
    }

    public void getLista(){
        Nodo aux = inicio;
        System.out.println(aux.val);
        for(int i = 0; i <= tamanho; i++){
            aux = aux.prox;
            System.out.println(aux.val);
        }
    }
    public void getElemento(int elemento){
        int count = 0;
        Nodo aux = inicio;
        while (aux.val != elemento){
            aux = aux.prox;
            count++;
        }
        int result = aux.val;
        System.out.println(result);
    }
    public void getTamanhoLista(){
        System.out.println(tamanho);
    }

}
