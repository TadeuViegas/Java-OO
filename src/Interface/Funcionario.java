package Interface;

public abstract class Funcionario {
    public String nome;
    private static int totalFuncionario;

    public Funcionario (){
        totalFuncionario++;
        System.out.println("ID: " + totalFuncionario);
    }

    public abstract void sound();

}

