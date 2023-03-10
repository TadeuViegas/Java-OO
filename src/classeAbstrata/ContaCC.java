package classeAbstrata;

public class ContaCC extends Conta{

    private int codSegurança;

    public ContaCC(int agencia, int numero) {
        super(agencia, numero);
    }

    public int getCodSegurança() {
        return codSegurança;
    }

    public void setCodSegurança(int codSegurança) {
        this.codSegurança = codSegurança;
    }

    @Override
    public void statusConta() {
        System.out.println("Saldo da conta corrente: " + this.getSaldo());
        System.out.println("Agencia da cc: " + super.getAgencia());
    }
}
