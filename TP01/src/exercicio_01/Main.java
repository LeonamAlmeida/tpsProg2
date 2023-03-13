package exercicio_01;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int nFuncionarios = 4;
		double[] valorPe = new double[nFuncionarios];
		double[] valorMao = new double[nFuncionarios];
		double[] valorPod = new double[nFuncionarios];
		double[] total = new double[nFuncionarios];
		
		for(int i = 0; i < nFuncionarios; i++) {
			
			System.out.println("Funcionaria " + (i+1));
			System.out.println("Valor serviço pés:");
			valorPe[i] = input.nextDouble();
			System.out.println("Valor serviço mãos");
			valorMao[i] = input.nextDouble();
			System.out.println("Valor serviço podologia");
			valorPod[i] = input.nextDouble();
			
			total[i] = (valorPe[i] + valorMao[i] + valorPod[i])	/ 2;	
		}
		input.close();
		
		for(int i = 0; i < nFuncionarios; i++) {
			
			System.out.println("Valor ganho pela funcionaria " + (i+1) + " = " + (total[i]));
		}
		
	}
}
