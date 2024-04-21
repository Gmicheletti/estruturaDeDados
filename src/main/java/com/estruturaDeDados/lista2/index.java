package com.estruturaDeDados.lista2;


public class index {

    public static void main(String[] args) {
        ListaArray lista = new ListaArray();
        lista.insereInicio(1);
        lista.getLista();
        lista.insereFim(3);
        lista.insereFim(4);
        lista.insereFim(5);
        lista.insereFim(6);
        lista.getLista();
        lista.inserePosicao(1,2);
        lista.getLista();

        lista.removeInicio();
        lista.getLista();
        lista.removeFim();
        lista.getLista();
        lista.removePosicao(1);
        lista.getLista();
        lista.removeElemento(5);
        lista.getLista();

        lista.getElemento(10);
        int countLista = lista.getCountLista();
        System.out.println(countLista);


    }


}
