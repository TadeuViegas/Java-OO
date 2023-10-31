package arrayList;

import arrayList.domain.Filme;
import arrayList.domain.Serie;
import arrayList.domain.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalLists {

    public static void main(String[] args) {
        List<Titulo> lista = getTitulos();
//        System.out.println(lista.size());
//
//        for(Titulo item : lista) {
//            System.out.println("Nome:" + item.getNome());
//            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
//                System.out.println("Classificação:" + filme.getClassificacao());
//            } else {
//                System.out.println("nao é um filme entao nao tem classificacao");
//            }
//        }

//        Outra forma de percorrer a lista. Sintaxy: NomedaLista.foreach(metodo com lambda ou method reference)
//        lista.forEach(System.out::println);


        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        buscaPorArtista.add("Bacate");
//        System.out.println(buscaPorArtista);

//        Collections.sort(buscaPorArtista);
//        System.out.println(buscaPorArtista);
//
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }

    private static List<Titulo> getTitulos() {
        Filme filme1 = new Filme("matrix", 2001);
        filme1.avalia(8);
        Filme filme2 = new Filme("300", 2005);
        filme2.avalia(10);
        Titulo filme3 = new Filme("branquelas", 2021);
        filme3.avalia(6);

//        Titulo serie1 = new Serie("peaky blinders", 2023);
//        serie1.avalia(6);
//        Serie serie2 = new Serie("peaky", 2024);
//        serie2.avalia(12);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
//        lista.add(serie1);
//        lista.add(serie2);
        return lista;
    }
}
