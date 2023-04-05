package methodsObject;

public class TestMethodsObjects {
    public static void main(String[] args) throws CloneNotSupportedException {
        var pessoa1 = new Pessoa("Tadeu", 32);
        Pessoa pessoa2 = new Pessoa("Tico", 35);
        Pessoa pessoa3 = new Pessoa("Tadeu", 32);

//        equals comparar dois objetos e retorna um bollean
        System.out.println(pessoa1.equals(pessoa2));
        System.out.println(pessoa1.equals(pessoa3));


//        hashCode retorna o identicador do objeto (int)
        System.out.println(pessoa1.hashCode());
        System.out.println(pessoa3.hashCode());

        System.out.println(pessoa1.getClass());

        Object clone = pessoa1.clone();
        System.out.println("original: " + clone);
        System.out.println("clone: " + pessoa1);

    }
}
