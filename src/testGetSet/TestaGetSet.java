package testGetSet;

import javax.swing.*;

public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(123, "02567");
//        conta.saldo = 100.0; Error: o valor nao pode ser alterado pois o atributo saldo é privado
        conta.deposita(1000);
//        System.out.println(conta.getSaldo());

        conta.saca(100);
//        System.out.println(conta.getSaldo());

        Cliente cliente = new Cliente();
        cliente.setNome("Tadeu");
        System.out.println(cliente.getNome());

        conta.setTitular(cliente);

//        System.out.println(conta.getTitular());
//        System.out.println(cliente);

        conta.getTitular().setNome("caneta azul");
        System.out.println(conta.getTitular().getNome());

        conta.statusConta();

//        UI para perguntar para o user um dado
//        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));

    }
}
