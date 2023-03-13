package Exercicio_01;

public class Main {

	public static void main(String[] args) {

        Grafo g1= new Grafo();
        g1.ExibeMatriz();
        System.out.println();
        System.out.println("Comparacao de 2 vertices:");
        if(g1.teste1e2()== 1) {
            System.out.println("Vertice 1 e 2 são vizinhos.");
        }
        else if(g1.teste1e2()== -1) {
            System.out.println("Vertice 1 e 2 não são vizinhos.");
        }
        /* os valores sao gerados aleatoriamente, dependendo da execução, todos os vertices
        podem ser vizinhos de um mesmo vertice
         */
    }
}
