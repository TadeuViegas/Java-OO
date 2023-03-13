package Interface;

public class Funcionario {
    public String nome;
    private static int totalFuncionario;

    public Funcionario (){
        totalFuncionario++;
        System.out.println("ID: " + +totalFuncionario);
    }

    public void sound(){
        System.out.println("ola mundo func");
        System.out.println("ola mundo func");
        System.out.println("ola mundo func");
    }

}

