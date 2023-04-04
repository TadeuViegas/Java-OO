package classeAbstrata;

public class ContaPP extends Conta{
    private int codSegurança;

    public ContaPP(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public String toString() {
        return "Metodo da Conta PP: " + super.toString();
    }

    public int getCodSegurança() {
        return codSegurança;
    }

    public void setCodSegurança(int codSegurança) {
        this.codSegurança = codSegurança;
    }


}
