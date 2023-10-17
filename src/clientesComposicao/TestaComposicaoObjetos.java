package clientesComposicao;

public class TestaComposicaoObjetos {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Tadeu Viégas Dev";
        cliente1.cpf = "04676079311";
        cliente1.profissao = "developer";

        Conta conta1 = new Conta(cliente1,123,12345);
//        accTadeu.cliente = cliente1;

        System.out.println(conta1.cliente);
        System.out.println(conta1.agencia);
        System.out.println(conta1.numero);
        System.out.println(cliente1);

        System.out.println(conta1.cliente.nome);
        System.out.println(conta1.cliente.profissao);

        conta1.saldo = 1.2;
        System.out.println("STATUS DA CONTA--------------------");
        System.out.println(conta1);

    }
}
