package exercicio_03.a;
import java.util.*;

public class Main {

    public static void main(String[] args){

        ArrayList<Integer> ListaInteiros = new ArrayList<Integer>();
        Random rdm = new Random();

        for(int i = 0; i < 50; i++){
            ListaInteiros.add(rdm.nextInt(100));
        }
        // i
        Integer menorNumero = Collections.min(ListaInteiros);
        Integer maiorNumero = Collections.max(ListaInteiros);
        // ii
        int menorNumeroAparece = Collections.frequency(ListaInteiros, menorNumero);
        // iii
        Collections.sort(ListaInteiros);

        System.out.println("Menor numero: " + menorNumero);
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Numero vezes menor aparece: " + menorNumeroAparece);
        System.out.println("Lista Ordenada: " + ListaInteiros);
    }
}