package varArgs;

public class Main {

    //VarArgs é um recurso do Java pra que possamos definir vários parametros para um metodo sem precisar definir explicitamente
    //Var Args = argumentos variaveis

    public static void main(String[] args) {
        System.out.println("Utilizando Var Args");
        System.out.println(somar("Tadeu",1, 2, 3, 4, 5));
    }

    static int somar(String nome, Integer... args) {
        int total = 0;
        for (Integer arg : args) {
            total += arg;
        }
        System.out.println(nome);
        return total;
    }
}
