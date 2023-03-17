package utilizandoEnum;

public enum Prioridade {
    MIN(1),NORMAL(5),MAX(10),FULL(30);

    private int numero;

    Prioridade(int valor){
        this.numero = valor;
    }

    public int getNumero(){
        return this.numero;
    }

}
