package exercicio_01.b;
import java.util.*;
public class Produto {

    private String nome;
    private int ID;
    private float valor;

    public Produto(String nome, int ID, float valor) {
        this.nome= nome;
        this.ID= ID;
        this.valor= valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " ID: " + getID() + " Valor: " + getValor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public boolean equals(Object obj) {
        Produto prod = (Produto)obj;
        if(this.getID() == prod.getID()){
            return true;
        } else {
            return false;
        }
    }
}
