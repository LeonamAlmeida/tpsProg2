package exercicio_03.b;
import java.time.LocalDate;
import  java.util.*;

public class AppTeste {

    public static void main(String [] args){

        ArrayList<Empregado> ListaEmpregados = new ArrayList<Empregado>();

        ListaEmpregados.add(new Empregado(1, "Joao", 4500, LocalDate.of(2002,4,25)));
        ListaEmpregados.add(new Empregado(45, "Maria", 3900, LocalDate.of(2020,9,4)));
        ListaEmpregados.add(new Empregado(3, "Leticia", 2500, LocalDate.of(2005,4,1)));
        ListaEmpregados.add(new Empregado(2, "Augusto", 1500, LocalDate.of(2004,4,2)));
        ListaEmpregados.add(new Empregado(32, "Victor", 9000, LocalDate.of(2019,4,3)));

        // i - crescente salario
        ListaEmpregados.sort(new Comparator<Empregado>() {
            public int compare(Empregado f1, Empregado f2) {
                return Double.compare(f1.getSalario(), f2.getSalario());
            }
        });
        // Imprime
        System.out.println("*******************************************");
        System.out.println("Funcionários ordenados pelo salário:");
        for (Empregado funcionario : ListaEmpregados) {
            System.out.println(funcionario);
        }
        // ii - alfabetica
        ListaEmpregados.sort(new Comparator<Empregado>() {
            public int compare(Empregado f1, Empregado f2) {
                return f1.getNome().compareTo(f2.getNome());
            }
        });
        // Imprime
        System.out.println("*******************************************");
        System.out.println("Funcionários ordenados em ordem alfabética:");
        for (Empregado funcionario : ListaEmpregados) {
            System.out.println(funcionario);
        }
        // iii - maior e menor salario
        Empregado funcionarioMaiorSalario = Collections.max(ListaEmpregados, new Comparator<Empregado>() {
            public int compare(Empregado f1, Empregado f2) {
                return Double.compare(f1.getSalario(), f2.getSalario());
            }
        });
        Empregado funcionarioMenorSalario = Collections.min(ListaEmpregados, new Comparator<Empregado>() {
            public int compare(Empregado f1, Empregado f2) {
                return Double.compare(f1.getSalario(), f2.getSalario());
            }
        });
        // imprime
        System.out.println("*******************************************");
        System.out.println("Funcionário com o maior salário: " + funcionarioMaiorSalario);
        System.out.println("Funcionário com o menor salário: " + funcionarioMenorSalario);

        // iv - experiencia
        Empregado funcionarioMaisExperiente = Collections.min(ListaEmpregados, new Comparator<Empregado>() {
            public int compare(Empregado f1, Empregado f2) {
                return f1.getDataContrato().compareTo(f2.getDataContrato());
            }
        });
        Empregado funcionarioMenosExperiente = Collections.max(ListaEmpregados, new Comparator<Empregado>() {
            public int compare(Empregado f1, Empregado f2) {
                return f1.getDataContrato().compareTo(f2.getDataContrato());
            }
        });
        // imprime
        System.out.println("*******************************************");
        System.out.println("Funcionário mais experiente: " + funcionarioMaisExperiente);
        System.out.println("Funcionário menos experiente: " + funcionarioMenosExperiente);
    }
}
