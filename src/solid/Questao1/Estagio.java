package solid.Questao1;

public class Estagio extends Colaborador implements Remuneravel{
    /*public void salarioEstag(){
        System.out.println("Pague o estagiario");
    }*/
    private int bolsaEstagio;
    @Override
    public void remuneracao() {
        this.bolsaEstagio = 1000;
        System.out.println("Bolsa do estag é: R$ " + this.bolsaEstagio);
    }
}
