package excecoes;

//se a classe criada extender de Runtime, a mesma será categoria unchecked
//se extender de Exception, será categoria checked

//uncheked -> o compilador não verifica nada, o fluxo fica normal
//checked -> se não tiver explicito na classe "trows" ou "try catch" acusará erro

public class MinhaExcecao extends RuntimeException{
    public MinhaExcecao(String msgm){
        super(msgm);
    }
}
