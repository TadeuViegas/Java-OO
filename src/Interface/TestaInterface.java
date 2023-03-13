package Interface;

public class TestaInterface {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "tadeu";
        cliente.sound();
        cliente.validaSenha(123);
        System.out.println();

/*  o tipo da referencia pode ser "classe base" ou a "interface"
    a depender dessa escolha a referencia vai usar apenas seus metodos*/

        Funcionario ref = new Diretor();
        ref.nome = "tadeu";
        ref.sound();
//        ref.validaSenha(123);


    }
}
