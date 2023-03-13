package exercicio_01.a;
import java.util.*;

public class ObjectSet {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int op;
        Set<String> NomeSet = new HashSet<>();
        // remover um determinado nome, se não pertencer msg erro informada
        // verificar se um determinado nome ja foi mencionado
        // apagar todos os nomes armazenados
        do{
            System.out.println("**************************************");
            System.out.println("""
                    1 - ARMAZENAR NOME
                    2 - REMOVER NOME
                    3 - VERIFICAR NOME
                    4 - APAGAR SET
                    5 - IMPRIMIR LISTA
                    0 - SAIR""");
            op = input.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("Nome:");
                    NomeSet.add(input.next());
                }
                case 2 -> {
                    System.out.println("Nome a ser removido:");
                    if (NomeSet.remove(input.next())) {
                        System.out.println("**************************************");
                        System.out.println("Nome removido!");
                        System.out.println(NomeSet);
                    } else {
                        System.out.println("Nome não encontrado!");
                    }
                }
                case 3 -> {
                    System.out.println("Nome a ser verificado:");
                    if (NomeSet.contains(input.next())) {
                        System.out.println("Nome está na lista");
                    } else {
                        System.out.println("Nome não está na lista");
                    }
                }
                case 4 -> {
                    NomeSet.clear();
                    System.out.println("Lista apagada");
                }
                case 5 -> System.out.println(NomeSet);
            }
        } while (op != 0);
    }
}
