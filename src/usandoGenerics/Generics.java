package usandoGenerics;

/*Para usar Generics é nessário usar o operador diamante <> na Classe
E dentro do operador usar tipo generico: <T> (T de Type)*/
public class Generics<T> {
    private T value;

    public void addValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
