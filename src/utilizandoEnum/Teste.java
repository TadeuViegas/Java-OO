package utilizandoEnum;

public class Teste {
    public static void main(String[] args) {
        Prioridade prioridadeMin = Prioridade.MIN;
        Prioridade prioridadeNormal = Prioridade.NORMAL;
        Prioridade prioridadeMax = Prioridade.MAX;
        Prioridade prioridadeFull = Prioridade.FULL;

        System.out.println(prioridadeMax.name());
        System.out.println(prioridadeFull.name());

        System.out.println(" ------ valores das constantes do Enum -----");
        System.out.println(prioridadeMin.ordinal());
        System.out.println(prioridadeNormal.ordinal());
        System.out.println(prioridadeMax.ordinal());
        System.out.println(prioridadeFull.ordinal());

        System.out.println(" ------ novos valores (setados) nas constantes -----");
        System.out.println(prioridadeMin.getNumero());
        System.out.println(prioridadeNormal.getNumero());
        System.out.println(prioridadeMax.getNumero());
        System.out.println(prioridadeFull.getNumero());

    }
}
