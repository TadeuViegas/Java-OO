public class CriaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 200.0;
        System.out.println("conta 1: " + conta1.saldo);

        Conta conta2 = new Conta();
        conta2.saldo = 350.3;
        System.out.println("conta 2: " + conta2.saldo);

        System.out.println("content in var conta1: " + conta1);
        System.out.println("content in var conta2: " + conta2);
    }
}
