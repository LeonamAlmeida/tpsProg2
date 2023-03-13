package exercicio_01.b;

import java.util.*;

public class AppTeste {

    public static void main(String[] args){
        int op, ID;
        float valor;
        String nome;
        Scanner input = new Scanner(System.in);
        Set<Produto> SetProduto = new HashSet<Produto>();

        do{
            System.out.println("""
                    1 - INSERIR PRODUTO
                    2 - IMPRIMIR LISTA DE PRODUTOS
                    0 - SAIR""");
            op = input.nextInt();
            if(op == 1) {
                System.out.print("Nome: ");
                nome = input.next();
                System.out.print("ID: ");
                ID = input.nextInt();
                System.out.print("Valor: ");
                valor = input.nextFloat();
                if (SetProduto.add(new Produto(nome, ID, valor))) {
                    System.out.println("Produto inserido!");
                } else {
                    System.out.println("Produto ja cadastrado!");
                }
            } else if(op == 2){
                System.out.println("**************************************");
                System.out.println("Lista:");
                if(!SetProduto.isEmpty()){
                    for(Produto Lista: SetProduto){
                        System.out.println(Lista);
                    } System.out.println("**************************************");
                } else{
                    System.out.println("Lista Vazia!");
                }
            }
        } while(op != 0);
    }
}
