package lambdaFunction;
@FunctionalInterface
interface Taxi{
    int reservar(String city);
}

public class Lambda {
    public static int imprimirCidade(String city){
        System.out.println("cidade: " + city);
        return 7;
    }

    public static void main(String[] args) {
        //java8 trouxe o lambda como forma mais enxuta de se implementar um interface funcionadl, ou seja, com um unico metodo abstrato
        //syntax of lambda function
        //(parameters do metodo da interface) -> {body implementação do metodo}

        Taxi taxi = Lambda::imprimirCidade;

        int retorno = taxi.reservar("MA");

        System.out.println(retorno);
    }
}
