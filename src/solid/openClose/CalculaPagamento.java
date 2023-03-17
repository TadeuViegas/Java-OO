package solid.openClose;

public class CalculaPagamento{
    int valor;

    int pagamento(Funcnario funcnario){
        this.valor = funcnario.bonificacao();
        return this.valor;
    }
}
