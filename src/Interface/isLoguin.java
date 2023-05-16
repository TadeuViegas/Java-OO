package Interface;

public class isLoguin implements Loguin{
    public final int senhaSistema = 123;
    @Override
    public void validaSenha(int senhaUser) {
        if (this.senhaSistema == senhaUser) {
            System.out.println("Entrou no sistema");
        } else {
            System.out.println("Senha errada");
        }
    }
}
