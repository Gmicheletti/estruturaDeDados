package com.estruturaDeDados.lista2;


import java.util.List;

public class lista2_Index {

    public static void main(String[] args) {

        iniciar();
    }


    public static void iniciar(){
        List<Integer> novaLista = ListaEncadeada.setList();
        ListaEncadeada.addInicioLista(novaLista, 1);
        ListaEncadeada.addInicioLista(novaLista, 2);
        ListaEncadeada.addInicioLista(novaLista, 3);
        ListaEncadeada.addFimLista(novaLista, 1000);
        ListaEncadeada.addPositionLista(novaLista, 770, 2);
        ListaEncadeada.removeInicioLista(novaLista);
        ListaEncadeada.removeFimLista(novaLista);
        ListaEncadeada.removePositionLista(novaLista, 1);
        System.out.println(novaLista);
    }
}
