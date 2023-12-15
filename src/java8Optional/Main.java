package java8Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // Criando um Optional com valor presente
        Optional<String> optional = Optional.of("Tadeu");

        // Verificando se o valor está presente e imprimindo
        if (optional.isPresent()) {
            System.out.println(optional);
        }

        optional.ifPresent(valor -> System.out.println("Valor dentro do optional: " + valor.length()));

        // Criando um Optional com valor ausente
        Optional<String> nomeOptionalVazio = Optional.empty();

        // Obtendo um valor padrão se o valor estiver ausente
        String nomeOuPadrao = nomeOptionalVazio.orElse("Nome Padrão");
        System.out.println("Nome: " + nomeOuPadrao);

        //orElseGet() é preciso passar como parametro um Consumer, ou seja, uma funçao que trata um valor mas nao retorna nada
        String name = null;
        String opt = Optional.ofNullable(name).orElseGet(() -> "juca");
        System.out.println(opt);

        String nome = "Tadeu";
        String opt1 = Optional.ofNullable(nome).orElse(printDefault());
        System.out.println(opt1);

        //usando metodo map para transformar valores
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);

        int size = listOptional.map(List::size).orElse(0);
        System.out.println(size);

        //usando map e filter para rejeitar valores fazendo testes in-line
        String password = " password ";
        Optional<String> passOpt = Optional.of(password).filter(p -> p.equals("password"));

//        Optional<String> correctPassword = passOpt.filter(pass -> pass.equals("password"));

        System.out.println(passOpt);

//        correctPassword = passOpt
//            .map(String::trim)
//            .filter(pass -> pass.equals("password"));
//
//        System.out.println(correctPassword);

        //orElseThrow para lançar um exceção como default
        String nullName = null;
        String name12 = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
    }

    static String printDefault() {
        System.out.println("hi ala");
        return null;
    }
}

