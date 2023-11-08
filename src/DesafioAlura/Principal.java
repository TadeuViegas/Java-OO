package DesafioAlura;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int op;
        int limit = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite do seu cartão: "));
        CartaoCredito cartaoCredito = new CartaoCredito(limit);
        do {
            String description = JOptionPane.showInputDialog("Digite a descrição do produto: ");
            int price = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço do produto: "));

            Product product = new Product(description,price);

            if (cartaoCredito.buyApproved(product)){
                System.out.println("Compra aprovada!!");
                op = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 pra sair ou 1 pra continuar as compras"));

            } else {
                System.out.println("Compra negada!! Sem saldo!!");
                op = 0;
            }
        } while (op == 1);

        cartaoCredito.showProducts();
    }
}
