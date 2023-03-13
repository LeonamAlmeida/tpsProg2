package exercicio_02;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome= nome;
        this.cargo= cargo;
        this.salario= salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome= nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo= cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalatio(double salario) {
        this.salario= salario;
    }

    public String toString() {
        return "Nome: " + getNome() + " Cargo: " + getCargo() + " Salario: " + getSalario();
    }
}