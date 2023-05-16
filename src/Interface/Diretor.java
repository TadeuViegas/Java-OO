package Interface;

public class Diretor extends Funcionario implements Loguin {
    private isLoguin loguin;
    public Diretor (){
        this.loguin = new isLoguin();
    }

    @Override
    public void sound() {
        System.out.println("Ola " + getClass().getSimpleName() + " " + this.nome);
    }

    @Override
    public void validaSenha(int senhaUser) {
        this.loguin.validaSenha(senhaUser);
        //pode-se fazer uma implementacao especifica
    }
}
