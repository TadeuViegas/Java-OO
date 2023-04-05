package methodsObject;

public class Pessoa implements Cloneable{
    String name;
    int age;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Pessoa pessoa = (Pessoa) obj;
        return this.age == pessoa.age &&
                this.name == pessoa.name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + " Age: " + this.age;
    }
}
