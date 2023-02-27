package clientesComposicao;

public class TestaComposicaoObjetos {
    public static void main(String[] args) {
        Cliente tadeu = new Cliente();
        tadeu.nome = "Tadeu Viégas Dev";
        tadeu.cpf = "04676079311";
        tadeu.profissao = "developer";

        Conta accTadeu = new Conta();

//        accTadeu.titular = tadeu;
        System.out.println(accTadeu.titular);
        System.out.println(tadeu);
        System.out.println(accTadeu.titular.nome);

    }
}
