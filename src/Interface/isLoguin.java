package Interface;

public class isLoguin {
    public int senhaSistema = 123;
    public void validaSenha(int senhaUser) {
        if (this.senhaSistema == senhaUser) {
            System.out.println("Entrou no sistema");
        } else {
            System.out.println("Senha errada");
        }
    }
}
