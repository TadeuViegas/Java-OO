package Interface;

public class Cliente extends Funcionario implements Loguin{

    private isLoguin loguin;

    public Cliente (){
        this.loguin = new isLoguin();
    }

    public void sound(){
        System.out.println("Ola " + this.getClass().getSimpleName() + " " + this.nome);
    }

    @Override
    public void validaSenha(int senhaUser) {
        this.loguin.validaSenha(senhaUser);
    }
}
