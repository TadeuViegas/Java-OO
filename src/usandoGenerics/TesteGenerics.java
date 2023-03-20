package usandoGenerics;

public class TesteGenerics {
    public static void main(String[] args) {
        Generics<Boolean> g = new Generics<>();

        g.addValue(2 > 1);
        System.out.println(g.getValue());
    }
}
