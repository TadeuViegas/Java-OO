package arrayList;

public class TesteArray {
    public static void main(String[] args) {
//        Formas de inicializar arrays primitivos e array de objetos

        // Array de primitos
        System.out.println("---Array inicializado com valores---");
        int[] arrayInt = new int[5];
        for (int a : arrayInt)
            System.out.printf(" " + a);

        System.out.println("\n");

        System.out.println("---Array inicializado com valores---");
        int[] arrayInt2 = {1,2,3,4,5};
        for (int a : arrayInt2)
            System.out.printf(" " + a);


    }
}
