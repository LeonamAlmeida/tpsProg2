package exercicio_05;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int x= 0, y= 0;
        double r= 0;
        try {
            Scanner teclado= new Scanner(System.in);
            System.out.println("Eu sei dividir!");
            System.out.println("Informe o primeiro valor: ");
            x = teclado.nextInt();
            System.out.println("Informe o segundo valor: ");
            y = teclado.nextInt();
            r = x/y;
        } catch(InputMismatchException e) {
            System.out.println("Informe um numero correto!");
        } catch(ArithmeticException e2) {
            System.out.println("Erro, div = 0");
        } catch(Exception e3) {
            System.out.println("Erro na main!");
        }
        System.out.println("O resultado é: " + r);
    }
}
