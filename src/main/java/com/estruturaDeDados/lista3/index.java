package com.estruturaDeDados.lista3;

public class index {
    public static void main(String[] args) {
        ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
        lista.insereInicio(1);
        lista.getLista();
        lista.inserirFim(3);
        lista.getLista();
        lista.inserirPosicao(1,2);
        lista.getLista();
    }
}
