package solid.openClose;

public class TesteOpenClose {
    public static void main(String[] args) {
        Estag estag1 = new Estag();

        CalculaPagamento calculaPagamento = new CalculaPagamento();
        System.out.println(calculaPagamento.pagamento(estag1));

    }
}
