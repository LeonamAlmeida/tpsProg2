package exercicio_07;

import java.util.*;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int quantidadeProduto;
		double total = 0;
		
		System.out.println("Quantidade de produtos para fatura:");
		quantidadeProduto = input.nextInt();
		
		Invoice[] produto = new Invoice[quantidadeProduto]; 
		
		for(int i = 0; i < quantidadeProduto; i++) {
			
			produto[i] = new Invoice(); // assim a variável produto receberá os valores da classe Invoice
			
			System.out.println("Produto " +(i+1));
			System.out.println("Numero do produto: ");
			produto[i].setNumero(input.nextInt()); // "set" - preencher o conteúdo de cada variável
			System.out.println("Descrição do item: ");
			produto[i].setDescreve(input.next()); // usando .nextLine na hora de imprimir não saia nada
			System.out.println("Quantidade de item: ");
			produto[i].setQtdItem(input.nextInt());
			System.out.println("Preço do item: ");
			produto[i].setPreço(input.nextDouble());
			produto[i].check(produto[i].getPreço(),produto[i].getQtdItem()); // checar e igualar valores < 0
			total += produto[i].getInvoiceAmount(); // soma todos os valores de todos os itens			
		}
		input.close();
		System.out.println();
		System.out.println("--------NOTA FISCAL--------");
		
		for(int i = 0; i < quantidadeProduto; i++) { // "get" para receber o conteúdo que foi settado,"set"
			System.out.println(produto[i].getDescreve() + " Número: " + produto[i].getNumero() + 
					" Quantidade: " + produto[i].getQtdItem() + " Preço: " + produto[i].getPreço() + "R$");
		}
		System.out.println();
		System.out.println("Valor total da fatura: " + total +"R$");
	}
}
