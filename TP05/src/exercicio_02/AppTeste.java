package exercicio_02;
import java.util.*;
public class AppTeste {
    public static void main(String[] args) {
        //d
        Map<Integer, Funcionario> Funcionarios= new HashMap<Integer, Funcionario>();
        Funcionarios.put(1, new Funcionario("Roberto", "ADM", 15000));
        Funcionarios.put(2, new Funcionario("Lohayne", "Professora estadual", 1500));
        Funcionarios.put(3, new Funcionario("Augusto", "Analista", 6700));
        Funcionarios.put(4, new Funcionario("Leticia", "Advogada", 5500));
        Funcionarios.put(5, new Funcionario("Matheus", "Garçon", 2200));

        if(Funcionarios.containsKey(1)) {
            System.out.println("Chave: 1 consta na lista!!!");
            System.out.println(Funcionarios.get(1));
            System.out.println("**************************************");
        }
        //e
        System.out.println("Lista de funcionarios");
        for(Map.Entry<Integer, Funcionario> entry: Funcionarios.entrySet()) {
            System.out.print(entry.getKey() + "-  ");
            System.out.print(entry.getValue() + "\n");
        }
    }
}
