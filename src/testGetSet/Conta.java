package testGetSet;

public class Conta {
    private Cliente titular;
    private int agencia;
    private int numero;
    private Double saldo = 0.;

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
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
        return this.saldo;
    }

    boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    void transfere(double valor, Conta contaDestino) {
        if(this.saldo >= valor){
            contaDestino.saldo += valor;
            this.saldo -= valor;
//            contaDestino.deposita(valor);
            System.out.println("Transferencia feita com Sucesso!");
            System.out.println("Saldo atual da conta do " + this.titular + ": R$" + this.saldo);
            System.out.println("Saldo atual da conta do " + contaDestino.titular + ": R$"  + contaDestino.saldo);
        } else System.out.println("Error: saldo insuficiente!");
    }

    void statusConta(){
        System.out.println(this.titular);
        System.out.println(this.saldo);
        System.out.println(this.agencia);
        System.out.println(this.numero);
    }
}
