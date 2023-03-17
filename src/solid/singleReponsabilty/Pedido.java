package solid.singleReponsabilty;

//codigo ruim -> god class

public class Pedido {
    void contaItem(){}
    void buscaItem(){}
    void adicionaItem(){}
    void deletaItem(){}
    void calculaTotalItem(){}

    void carregaPedido(){}
    void salvaPedido(){}
    void atualizaPedido(){}
    void deletaPedido(){}

    void exibePedido(){}
    void showItensPedido(){}
}

/*codigo bom -> sepapara as responsabilidade
refatorar a god class em varias classes menores */
