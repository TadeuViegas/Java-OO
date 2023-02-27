package clientesComposicao;

public class Conta {
    Cliente titular;
    int agencia;
    int numero;
    Double saldo;

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
