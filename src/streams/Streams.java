package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Em java usamos Streams para se trabalhar com processamento de dados (collections, array, arquivos, regex)
// geralmente uma lista é convertida pra stream e assim pode-se usar metodos para tratar os dados da coleção
public class Streams {

    public static void main(String[] args) {
        System.out.println("STREAMS JAVA 8");

        List<String> lista = Arrays.asList("a", "b", "c");
        List<String> result = lista.stream() // converte uma lista para uma stream
            .filter(l -> l.startsWith("a")) // operações intermediarias (filtram ou transformam(map) os dados):
            .map(String::toUpperCase) // filter, map, sorted, peek
            .collect(Collectors.toList()); // operações terminal (que produzem resultado final): collect,

        System.out.println(result);

        Stream<String> stream = Stream.empty();
        System.out.println(stream);
    }
}