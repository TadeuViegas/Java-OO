public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaTadeu = new Conta();
//        contaTadeu.saldo = 1000.0;
//        contaTadeu.titular = "Tadeu";

        Conta contaTico = new Conta();
        contaTico.saldo = 50.0;
        contaTico.titular = "Tico";

        Conta contaJuca = new Conta();


//        contaTadeu.saca(100);
//        contaTadeu.deposita(50);
//        contaTadeu.transfere(150,contaTico);
        contaTadeu.statusConta();
    }
}
