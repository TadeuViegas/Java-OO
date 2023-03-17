package solid.InterfaceSegregation;

public class Papagaio implements Ave, AveQueVoam {
    @Override
    public void buscaLocal() {
        System.out.println("Mostra local do papagai");
    }

    @Override
    public void exibeAve() {
        System.out.println("Exibe tipo do papagai");
    }

    @Override
    public void Voar() {
        System.out.println("Voaa papagai fdpe");
    }
}
