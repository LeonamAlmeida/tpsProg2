package exercicio_08;

public class Main {
	
	public static void main(String[] args) {
		
		IntegerSet conjunto1 = new IntegerSet();
		conjunto1.inserirElemento(5); conjunto1.inserirElemento(10);
		conjunto1.inserirElemento(15); conjunto1.inserirElemento(20);
		conjunto1.inserirElemento(25); conjunto1.inserirElemento(30);
		
		IntegerSet conjunto2 = new IntegerSet();
		conjunto2.inserirElemento(5); conjunto2.inserirElemento(15);
		conjunto2.inserirElemento(30); conjunto2.inserirElemento(55);
		conjunto2.inserirElemento(100); conjunto2.inserirElemento(200);
		
		System.out.println("Conjunto 1 = " + conjunto1.toString());
        System.out.println("Conjunto 2 = " + conjunto2.toString());
        System.out.println("intersecção = " + conjunto1.intersec(conjunto2).toString());
        System.out.println("união = " + conjunto1.uniao(conjunto2).toString());
        System.out.println("Conj.1 e conj.2 são iguais? " + conjunto1.ehIgual(conjunto2));	
        
        conjunto1.deletarElemento(5);
        conjunto1.deletarElemento(15);
        conjunto1.deletarElemento(30);
        
        System.out.println("--------------------------------------");
        System.out.println("Excluindo valores de conjunto 1");
        System.out.println("Conjunto 1 = " + conjunto1.toString());
        System.out.println("Conjunto 2 = " + conjunto2.toString());
        System.out.println("intersecção = " + conjunto1.intersec(conjunto2).toString());
        
        IntegerSet conjunto3 = new IntegerSet();
        conjunto3.inserirElemento(10);
        conjunto3.inserirElemento(20);
        conjunto3.inserirElemento(25);
        
        System.out.println("--------------------------------------");
        System.out.println("Adicionando conjunto 3");
        System.out.println("Conjunto 1 = " + conjunto1.toString());
        System.out.println("Conjunto 3 = " + conjunto3.toString());
        System.out.println("intersecção = " + conjunto1.intersec(conjunto3).toString());
        System.out.println("união = " + conjunto1.uniao(conjunto3).toString());
        System.out.println("Conj.1 e conj.3 são iguais? " + conjunto1.ehIgual(conjunto3));
        System.out.println("--------------------------------------");            
	}
}
