package usandoGenerics;

public class TesteGenerics {
    public static void main(String[] args) {
//        Ao usar a classe com Generics eu posso declarar qual o tipo
        Generics<Boolean> g = new Generics<>();
        Generics<Integer> g1 = new Generics<>();

        g.addValue(false);
        System.out.println(g.getValue());

        g1.addValue(10);
        System.out.println(g1.getValue());
    }
}
