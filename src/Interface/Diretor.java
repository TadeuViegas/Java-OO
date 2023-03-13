package Interface;

public class Diretor extends Funcionario implements Loguin {
    private isLoguin loguin;
    public Diretor (){
        this.loguin = new isLoguin();
    }
    @Override
    public void sound() {
        System.out.println("ola mundo, diretor");
        System.out.println("nome do diretor: " + this.nome);
    }

    @Override
    public void testNome() {
        System.out.println("ue");
    }

    @Override
    public void validaSenha(int senhaUser) {
        this.loguin.validaSenha(senhaUser);
        System.out.println("impletançao especifica");
    }
}
