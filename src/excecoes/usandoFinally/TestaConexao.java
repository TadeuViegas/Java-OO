package excecoes.usandoFinally;

public class TestaConexao {
    public static void main(String[] args) {

        /*codigo enxuto usando "try with resource"
            o try é usado como metodo e nao como bloco
                e nele é instaciado o objeto
            o bloco finally é criado automaticamente (interface AutoCloseble)*/

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch (IllegalStateException exception){
            System.out.println("Erro na conexao");
        }

        //codigo legado usado try catch (finally opcional)

        /*Conexao conexao = new Conexao();
        try {
            conexao.leDados();
        } catch (IllegalStateException ex){
            System.out.println("Deu erro na conexao");
        }finally {
            conexao.fechaConexao();
        }*/

    }
}
