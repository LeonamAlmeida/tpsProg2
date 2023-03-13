package exercicio_10;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n, sup;
		
		System.out.println("Digite o numero:");
		n = input.nextInt();
		input.close();
		
		System.out.println("Número decomposto em primos:");
		//inicia em 2 pois 0 e 1 não são primos
		for(int i = 2; i <= n; i++) {
			sup = 1; //inicia em 1 para verificação
			for(int j = 2; j < i; j++) {
				if(i % j == 0) // resto de i e j == 0, não é primo sup = 0, cancelando o próximo if
					sup = 0;
			}
			if(sup == 1) 
				System.out.print(+ i + " ");
		}
	}
}
