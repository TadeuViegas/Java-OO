package solid.InterfaceSegregation;

public class Pinguin implements Ave{
    @Override
    public void buscaLocal() {
        System.out.println("Mostra local do Pinguin");
    }

    @Override
    public void exibeAve() {
        System.out.println("Exibe tipo do Pinguin");

    }

  /*  @Override
    public void Voar() {
        //erro -> pinguim nao voa
    }*/
}
