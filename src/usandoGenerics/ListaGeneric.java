package usandoGenerics;

import java.util.ArrayList;

public class ListaGeneric<T> {
    ArrayList<T> lista = new ArrayList<T>();

    void addElement(T element){
        lista.add(element);
    }

    T getElement(int index){
        return lista.get(index);
    }

    int size(){
        return lista.size();
    }
}
