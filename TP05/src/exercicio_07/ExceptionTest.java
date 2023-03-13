package exercicio_07;

import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args){ // nao mudei nada, acho q ta funfando legal

        Conta c1 = new Conta(5000);
        Scanner input = new Scanner(System.in);
        System.out.println("Saldo atual: " + c1.getSaldo());
        try {
            System.out.println("Valor a ser depositado:");
            c1.depositar(input.nextInt());
        } catch(ContaExcecao e){
            System.out.println(e.getMensagem());
        }
        System.out.println("Saldo atual: " + c1.getSaldo());
        try {
            System.out.println("Valor a ser sacado:");
            c1.sacar(input.nextInt());
        } catch(ContaExcecao f){
            System.out.println(f.getMensagem());
            System.out.println("Saldo atual: " + c1.getSaldo());
        }
    }
}
