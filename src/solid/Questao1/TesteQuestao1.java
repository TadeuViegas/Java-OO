package solid.Questao1;

import solid.openClose.Estag;

public class TesteQuestao1 {
    public static void main(String[] args) {
        Contrato clt = new Contrato();

        FolhaDePagamento pagamento = new FolhaDePagamento();
        pagamento.pagamento(clt);

        Estagio estag = new Estagio();
        pagamento.pagamento(estag);
    }
}
