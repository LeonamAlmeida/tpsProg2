package exercicio_07;

public class ContaExcecao extends Exception{

    private String mensagem;

    public ContaExcecao(String mensagem) { // construtor ja recebendo a mensagem de erro
        this.mensagem= mensagem;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) { // utilizado na hora de informar o erro, na main
        this.mensagem= mensagem;
    }
}
