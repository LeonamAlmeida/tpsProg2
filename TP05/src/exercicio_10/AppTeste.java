package exercicio_10;
import java.util.*;

public class AppTeste {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Calculator c1 = new Calculator();
        int op;
        double a,b,c;

        do{
            System.out.println("""
                    Calculadora
                    1. Divisão
                    2. Log10
                    0. SAIR""");
            op = input.nextInt();
            switch (op) {
                case 1 -> {
                    try {
                        System.out.println("Informe o numerador");
                        a = input.nextDouble();
                        System.out.println("Denominador");
                        b = input.nextDouble();
                        System.out.println("Resultado: " + c1.div(a, b));
                    } catch (InvalidOperationException e) {
                        System.out.println(e.getException());
                        e.printStackTrace();
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Informe o numero para log de 10");
                        c = input.nextDouble();
                        System.out.println("Resultado: " + c1.log10(c));
                    } catch (InvalidOperationException e) {
                        System.out.println(e.getException());
                        e.printStackTrace();
                    }
                }
            }
        } while(op != 0);
    }
}
