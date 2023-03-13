package Interface;

public class Cliente extends Funcionario implements Loguin{

    private isLoguin loguin;

    public Cliente (){
        this.loguin = new isLoguin();
    }
    @Override
    public void sound(){
        System.out.println("ola mundo cliente");
        System.out.println(nome);
    }

    @Override
    public void testNome() {

    }

    @Override
    public void validaSenha(int senhaUser) {
        this.loguin.validaSenha(senhaUser);
    }
}
