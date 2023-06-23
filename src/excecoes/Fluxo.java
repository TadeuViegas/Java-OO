package excecoes;

import jdk.jfr.Experimental;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
            //catch polimorfico usando tipo da superclass
            //catch(Exception ex)
        } catch(ArithmeticException | NullPointerException ex) {
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1()  {
        System.out.println("Ini do metodo1");
        try{
            metodo2();
        } catch (Exception ex){
            System.out.println("azedou");
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
//        ArithmeticException arithmeticException = new ArithmeticException();
//        throw arithmeticException;
        throw new MinhaExcecao("minha excecao");

//        System.out.println("Fim do metodo2");
    }
}