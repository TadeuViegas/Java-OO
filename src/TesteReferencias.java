public class TesteReferencias {
    public static void main(String[] args) {
        Conta acc1 = new Conta();
        acc1.saldo = 200.0;

        System.out.println("saldo acc1: $" + acc1.saldo);
        Conta acc2 = acc1;

        System.out.println("saldo acc2: $" + acc2.saldo);

        acc2.saldo += 100;
        System.out.println("novo saldo acc2: $" + acc2.saldo);
        System.out.println("novo saldo acc1: $" + acc1.saldo);

        System.out.println("end memo acc1: " + acc1);
        System.out.println("end memo acc2: " + acc2);
    }
}