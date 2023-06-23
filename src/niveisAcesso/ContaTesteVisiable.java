package niveisAcesso;

import testGetSet.Conta;

public class ContaTesteVisiable extends Conta {
    public ContaTesteVisiable(int agencia, String numero) {
        super(agencia, numero);
    }

    public void getNumeroPrivado(){
        System.out.println(this.num);
    }
}
