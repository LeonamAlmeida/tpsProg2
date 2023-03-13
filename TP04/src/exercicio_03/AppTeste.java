package exercicio_03;

public class AppTeste {

    public static void main(String[] args){

        // criando objetos
        Number n1 = new Number(15);
        Number n2 = new Number(15);
        Number n3 = new Number(40);

        // teste de igualdade entre objetos
        System.out.println(n1.equals(n2)); // true
        System.out.println(n1.equals(n3)); // false

        // testando hashCode
        System.out.println(n1.hashCode() == n2.hashCode()); // true
        System.out.println(n2.hashCode() == n3.hashCode()); // false

        // testando toString
        System.out.println(n1.toString()); // vai printar 15
        System.out.println(n2.toString()); // 15
        System.out.println(n3.toString()); // 40
    }
}
