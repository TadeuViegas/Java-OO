package classeAbstrata;

public class TestaClasseAbstrata {
    public static void main(String[] args) {
//        Nota: não se pode instanciar um objeto de uma classe abstrata,
//        apenas de suas derivadas (concretas).

        Conta contacc = new ContaCC(123,45678);
        contacc.setSaldo(154.);
        contacc.statusConta();

        ContaPP contapp = new ContaPP(132,1654);
        contapp.setCodSegurança(1);
        contapp.setSaldo(294.);
        contapp.statusConta();
    }
}
