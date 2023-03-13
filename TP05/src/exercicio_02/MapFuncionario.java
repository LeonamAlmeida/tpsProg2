package exercicio_02;

import java.util.*;

public class MapFuncionario {

    public static void main(String[] args){

        //a
        Map<String, String> Funcionarios = new HashMap<>();

        Funcionarios.put("a1234", "Steve Jobs");
        Funcionarios.put("a1235", "Scott McNealy");
        Funcionarios.put("a1236", "Jeff Bezos");
        Funcionarios.put("a1237", "Larry Ellison");
        Funcionarios.put("a1238", "Bill Gates");

        System.out.println("Lista de Funcionarios:");
        for(Map.Entry<String, String> entry: Funcionarios.entrySet()) {
            System.out.print(entry.getKey() + "-  ");
            System.out.print(entry.getValue() + "\n");
        }
        //b
        System.out.println("**************************************");
        System.out.println("Chave: a6666 esta na lista? " + Funcionarios.containsKey("a6666"));
        System.out.println("Chave: a1235 esta na lista? " + Funcionarios.containsKey("a1235"));
        System.out.println("**************************************");

        //c
        System.out.println("Metodo buscar por chave: ");
        System.out.println("Chave: A1234 esta na lista? " + buscarPorChave("A1234"));
    }
    public static boolean buscarPorChave(String chave) {
        if(chave == "a1234" || chave == "A1234")
            return true;
        return false;
    }

}
