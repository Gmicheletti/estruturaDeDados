package com.estruturaDeDados.lista3;

public class index {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.insereInicio(1);
        lista.getLista();
        lista.inserirFim(4);
        lista.getLista();
        lista.inserirFim(5);
        lista.inserirFim(6);

        lista.getLista();
        lista.inserirPosicao(1,2);
        lista.inserirPosicao(2,3);
        lista.getLista();
        lista.removeInicio();
        lista.getLista();
        lista.removeFim();
        lista.getLista();
        lista.removePosicao(1);
        lista.getLista();
        lista.removerElemento(4);
        lista.getLista();
        lista.getElemento(5);
        lista.getTamanhoLista();
    }
}
