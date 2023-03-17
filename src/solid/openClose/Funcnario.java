package solid.openClose;

public abstract class Funcnario {
    String nome;
    int saldo;

    public int bonificacao() {
        return this.saldo;
    }

}
