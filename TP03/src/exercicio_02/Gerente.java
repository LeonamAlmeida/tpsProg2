package exercicio_02;

public class Gerente extends Empregado{
	
	private String nomeGerencia;

    public String getNomeGerencia(){
        return nomeGerencia;
    }
    public void setNomeGerencia(String nomeGerencia){
        this.nomeGerencia = nomeGerencia;
    }
    public String toString(){
        return "NOME: " + getNome() + "\n" + "IDADE: " + getIdade() + "\n" + "MATRICULA: " + getMatricula() + "\n"
                + "NOME GERENCIA: " + getNomeGerencia() + "\n" + "VALOR INSS: " + valorInss() + "$$"+ "\n";
    }
}
