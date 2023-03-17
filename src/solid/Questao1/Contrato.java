package solid.Questao1;

public class Contrato extends Colaborador implements Remuneravel{
    /*public void salarioContrato(){
        System.out.println("Pague o CLT");
    }*/

    @Override
    public void remuneracao() {
        System.out.println("Pague o CLT");
    }
}
