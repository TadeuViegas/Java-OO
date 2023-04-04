package classeAbstrata;

public class ContaCC extends Conta{

    private int codSegurança;

    public ContaCC(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public String toString() {
        return "Metodo da Conta CC: " + "Ag: " + getAgencia() + ", Num: " + getNumero();
    }

    public int getCodSegurança() {
        return codSegurança;
    }

    public void setCodSegurança(int codSegurança) {
        this.codSegurança = codSegurança;
    }


}
