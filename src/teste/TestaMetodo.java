package teste;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaTadeu = new Conta();
//        contaTadeu.saldo = 1000.0;
        contaTadeu.titular = "Tadeu";
        contaTadeu.agencia = 123;

        Conta contaTico = new Conta();
        contaTico.saldo = 50.0;
        contaTico.titular = "Tico";

        Conta contaJuca = new Conta();

//        contaTadeu.saca(100);
//        contaTadeu.deposita(50);
//        contaTadeu.transfere(150,contaTico);
        
        contaTadeu.statusConta();
        /* Resultado do teste:
        * Quando um objeto é instaciado na memoria o java atribui para os campos/atributos,
        * valor 0 se o atributo for do tipo primitivo (int, char, boolean, double)
        * Null caso o atributo seja do tipo clase (String, Double, Interger, Array)
         */
    }
}
