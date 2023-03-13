package exercicio_02;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int tamanho = 50;
        int[] dif = new int[tamanho];
        String[] nome = new String[tamanho];
        int[] estoqueIdeal = new int[tamanho];
        int[] qtdEstoque = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Nome da planta " + (i+1) + ":");
            nome[i] = input.nextLine();
            System.out.println("Estoque ideal da " + nome[i] + ":");
            estoqueIdeal[i] = input.nextInt();
            System.out.println("Quantidade em estoque:");
            qtdEstoque[i] = input.nextInt();
            input.nextLine(); // forma de limpar o scanner, estava dando erro sem
        }
        input.close();

        for(int i = 0; i < tamanho; i++){
            if(estoqueIdeal[i] > qtdEstoque[i]){
                dif[i] = estoqueIdeal[i] - qtdEstoque[i];
                System.out.println("----------------------------------");
                System.out.println("Planta " + nome[i] + " está em falta!");
                System.out.println("É necessário comprar " + dif[i] + " dessa planta no próximo dia");
            }
        }
    }
}