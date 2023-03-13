package exercicio_07;

public class Invoice {
	
	public Invoice() {}
	
	private int numero;
	private String descreve;
	private int qtdItem;
	private double preço;
	
	public int getNumero() { //get - public + tipo +get(Nome){ return nome; }
		return numero;
	}
	public void setNumero(int numero) { //set - public void set(Nome){ return this.nome = nome; }
		this.numero = numero;
	}
	public String getDescreve() {
		return descreve;
	}
	public void setDescreve(String descreve) {
		this.descreve = descreve;
	}
	public int getQtdItem() {
		return qtdItem;
	}
	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public void check(double preço, int qtdItem) {
		if(qtdItem < 0) {
			this.qtdItem = 0;
		}
		if(preço < 0) {
			this.preço = 0.0;
		}
	}
	
	public double getInvoiceAmount() { //calcular valor da fatura
		double total = this.qtdItem * this.preço;
		return total; // valor da fatura de cada produto
	}	
}
