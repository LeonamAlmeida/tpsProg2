package exercicio_03.b;

import java.time.LocalDate;

public class Empregado {

    private int ID;
    private String nome;
    private double salario;
    private LocalDate dataContrato;

    public Empregado(int ID, String nome, double salario, LocalDate  dataContrato){
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
        this.dataContrato = dataContrato;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public LocalDate  getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(LocalDate  dataContrato) {
        this.dataContrato = dataContrato;
    }
    @Override
    public String toString() {
        return "ID: " + ID + " | Nome: " + nome + " | Salário: " + salario + " | Data de Contratação: " + dataContrato;
    }
}
