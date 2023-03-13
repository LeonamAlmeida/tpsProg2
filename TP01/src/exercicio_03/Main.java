package exercicio_03;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero para a sequência:");
        n = input.nextInt();
        int sequencia;
        sequencia = sequenciaRecursiva(n);

        System.out.println("Resultado da sequencia: " + sequencia);
        input.close();
    }
    public static int sequenciaRecursiva(int n){

        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        } else {
            return 2 * sequenciaRecursiva(n-1) + 3 * sequenciaRecursiva(n-2);
        }
    }
}