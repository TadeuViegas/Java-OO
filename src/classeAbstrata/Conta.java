package classeAbstrata;

public abstract class Conta {
    private int agencia;
    private int numero;
    private Double saldo;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque feito com sucesso!");
            System.out.println("Saldo atual: " + this.saldo);
        } else {
            System.out.println("Error: Saldo insufiente");
            System.out.println("Saldo atual: " + this.saldo);
        }
    }

    void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Deposito feito com sucesso!");
        System.out.println("Saldo atual: " + this.saldo);
    }

    void transfere(double valor, Conta contaDestino) {
        if(this.saldo >= valor){
            contaDestino.saldo += valor;
            this.saldo -= valor;
//            contaDestino.deposita(valor);
            System.out.println("Transferencia feita com Sucesso!");
        } else System.out.println("Error: saldo insuficiente!");
    }

    public abstract void statusConta();

}
