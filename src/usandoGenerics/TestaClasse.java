package usandoGenerics;

public class TestaClasse {
    public static void main(String[] args) {
//        Ao usar a classe com Generics eu posso declarar qual o tipo
        ClasseGeneric<Boolean> g = new ClasseGeneric<>();
        ClasseGeneric<Integer> g1 = new ClasseGeneric<>();
        ClasseGeneric<String> g2 = new ClasseGeneric<>();

        g2.addValue("tadeu");
        System.out.println(g2.getValue());

        g.addValue(false);
        System.out.println(g.getValue());

        g1.addValue(10);
        System.out.println(g1.getValue());
    }
}
