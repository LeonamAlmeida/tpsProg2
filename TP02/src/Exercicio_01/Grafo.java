package Exercicio_01;

public class Grafo {

	public String ExibeMatriz() {
        int i, j;
        int [][] matriz= new int[5][5];
        for(i= 0; i< matriz.length; i++) {
            for(j= 0; j< matriz.length; j++) {
                matriz[i][j]= (int)(Math.random()*2);// random 0 a 1
                if(matriz[i]== matriz[j])
                    matriz[i][j]= 0;
            }
        }
        System.out.println("Matriz adjacente");
        System.out.println();
        for(i= 0; i< matriz.length; i++) {
            for(j= 0; j< matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Vertices vizinhos:");
        testeTodosVertices(matriz);
        return null;
    }
    @SuppressWarnings("unused")
	public int teste1e2() {
        int i, j;
        int [][] matriz= new int[5][5];
        for(i = 0; i< matriz.length; i++) {
            for(j= 0; j< matriz.length; j++) {
                if(matriz[0][1]== 1 || matriz[1][0]== 1)
                    return 1;
                else
                    return -1;
            }
        }
        return 0;
    }
    public void testeTodosVertices(int[][] matriz) {
        int i, j, cont= 0;
        for(i = 0; i< matriz.length; i++) {
            for(j= 0; j< matriz.length; j++) {
                if(matriz[i][j]== 1)
                    cont++;
                if(cont== 4)
                    System.out.println("Todos vertices sao vizinhos ao vertice " + (i+1));
            }
            cont= 0;
        }
    }
}