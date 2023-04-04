package teste;

import classeAbstrata.ContaCC;
import classeAbstrata.Conta;
import classeAbstrata.ContaPP;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaCC(123,212);
        System.out.println(c1);

        ContaPP c2 = new ContaPP(123,12345);
        System.out.println(c2);

        ContaCC c3 = new ContaCC(123,12354123);
        System.out.println(c3);
    }
}

