package com.estruturaDeDados.lista2;

import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada {

    public static List<Integer> setList(){
        List<Integer> newList = new ArrayList<>();
        return newList;
    }

    public static List<Integer> addInicioLista(List<Integer> newList, int item){
        newList.add(0,item);
        return newList;
    }

    public static List<Integer> addFimLista(List<Integer> newList, int item){
        newList.add(item);
        return newList;
    }

    public static List<Integer> addPositionLista(List<Integer> newList, int item, int index){
        newList.add(index,item);
        return newList;
    }


    public static List<Integer> removeInicioLista(List<Integer> newList){
        newList.remove(0);
        return newList;
    }

    public static List<Integer> removeFimLista(List<Integer> newList){
        int tamanho = newList.size();
        newList.remove(tamanho -1 );
        return newList;
    }

    public static List<Integer> removePositionLista(List<Integer> newList, int index){
        newList.remove(index);
        return newList;
    }



}
