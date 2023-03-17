package solid.Questao1;

public class FolhaDePagamento {
//    codigo ruim -> sempre que for criada nova class precisa alterar o codigo

    /*public void pagamento(Colaborador colaborador){
        if (colaborador instanceof Contrato){
            ((Contrato) colaborador).salarioContrato();
        } else if (colaborador instanceof Estagio){
            ((Estagio) colaborador).salarioEstag();
        }
    }*/

//    codigo bom -> OCP Isolar o comportamento extensivel atras de uma interface
    public void pagamento(Remuneravel colaborador){
        System.out.println("--------PAGAMENTO--------");
        colaborador.remuneracao();
    }
}
