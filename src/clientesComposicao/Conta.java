package clientesComposicao;

public class Conta {
    Cliente cliente;
    int agencia;
    int numero;
    Double saldo;

    public Conta(Cliente cliente, int agencia, int numero){
        this.cliente = cliente;
        this.agencia = agencia;
        this.numero = numero;
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
            System.out.println("Saldo atual da conta do " + this.cliente + ": R$" + this.saldo);
            System.out.println("Saldo atual da conta do " + contaDestino.cliente + ": R$"  + contaDestino.saldo);
        } else System.out.println("Error: saldo insuficiente!");
    }

//    void statusConta(){
//        System.out.println(this.cliente.nome);
//        System.out.println(this.saldo);
//        System.out.println(this.agencia);
//        System.out.println(this.numero);
//    }

    public String toString(){
        return "Cliente:" + cliente.nome + "\n" + "Saldo:" + saldo
                +  "\n" + "Ag:" + agencia + "\n" + "Acc:" + numero;
    }
}
