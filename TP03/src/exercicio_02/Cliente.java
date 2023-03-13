package exercicio_02;

public class Cliente extends Pessoa{
	
	private double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return valorDivida;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String toString(){
        return "NOME: " + getNome() + "\n" + "IDADE: " + getIdade() + "\n" + "SEXO: " + getSexo() + "\n"
                + "VALOR DIVIDA: " + getValorDivida() + "$$" + "\n" + "ANO NASCIMENTO: " + getAnoNascimento() + "\n";
    }
}
