package exercicio_05;

import java.util.*;

public class Main {
    public static final int TAM = 3;
    public static void main(String[] args){

        int[][] matriz = new int[TAM][TAM];

        receberTeclado(matriz);
        imprimir(matriz);
        rotacionar90(matriz);
        imprimir(matriz);
    }
    public static void receberTeclado(int[][] matriz){
        Scanner input = new Scanner(System.in);
        System.out.println("Valores para a matriz");
        for(int i = 0; i < TAM; i++){
            for(int j = 0; j < TAM; j++){
                matriz[i][j] = input.nextInt();
            }
        }
        input.close();
    }
    public static void imprimir(int[][] matriz){

        for(int i = 0; i < TAM; i++){
            for(int j = 0; j < TAM; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    public static void rotacionar90(int[][] matriz){

        int[][] matriz2 = new int[TAM][TAM];
        System.out.println("-----------------");
        System.out.println("Gira em 90 graus:");
        System.out.println("-----------------");
        for(int i = 0; i < TAM; i++){
            for(int j = 0; j < TAM; j++){
                matriz2[j][TAM - 1 -i] = matriz[i][j];
            }
        }
        copiar(matriz, matriz2);
    }
    public static void copiar(int[][] matriz, int[][] matriz2){

        for(int i = 0; i < TAM; i++){
            for(int j = 0; j < TAM; j++){
                matriz[i][j] = matriz2[i][j];
            }
        }
    }
}
