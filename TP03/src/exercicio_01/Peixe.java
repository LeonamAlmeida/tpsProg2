package exercicio_01;

public class Peixe extends Animal{
	
	private String tipoHabitat;

    public Peixe(String nome){
        super(nome);
    }
    public String getTipoHabitat(){
        return tipoHabitat;
    }
    public void setTipoHabitat(String tipoHabitat){
        this.tipoHabitat = tipoHabitat;
    }

    public String toString(){
        return "Nome: " + getNome() + "\n" + "Peso: " + getPeso() + "kg" + "\n" + "Habitat: " + tipoHabitat + "\n";
    }
}
