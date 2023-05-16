package usandoGenerics;

import java.util.ArrayList;

public class TestaLista {
    public static void main(String[] args) {

        System.out.println("---------------- Usando lista generica: ---------------- ");
        ListaGeneric<Integer> lista = new ListaGeneric<>();

        lista.addElement(123);
        lista.addElement(31245);

        System.out.println(lista.size());
        System.out.println(lista.getElement(1));

        ListaGeneric<String> lista1 = new ListaGeneric<>();
        lista1.addElement("tadeu");
        lista1.addElement("1drk");

        System.out.println(lista1.getElement(1));

        System.out.println("---------------- Usando Lista normal ---------------- ");
        ArrayList<Boolean> lista3 = new ArrayList<>();
        lista3.add(false);
        lista3.add(true);
        lista3.add(false);

        System.out.println("Tamanho da lista: " + lista3.size());
        System.out.println("posicao 1: " + lista3.get(1));

        System.out.println("Percorrendo a lista com for each:");
        for (Boolean b: lista3) {
            System.out.println(b);
        }

    }
}
