package solid.InterfaceSegregation;

public class TestaISP {
    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio();
        papagaio.buscaLocal();
        papagaio.exibeAve();
        papagaio.Voar();

        System.out.println("---------------");
        Pinguin pinguin = new Pinguin();
        pinguin.buscaLocal();
        pinguin.exibeAve();
    }
}
