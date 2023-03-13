package exercicio_04;

public class TesteException {

    public static void main(String[] args) {
        System.out.println("Inicio do Main");
        metodo1();
        System.out.println("Fim do main");
    }

    static void metodo1() {
        System.out.println("Inicio do Metodo1");
        metodo2();
        System.out.println("Fim do Metodo1");
    }

    static void metodo2() {
        System.out.println("Inicio do Metodo2");
        int[] array= new int[10];
        try {
            for(int i= 0; i<= 15; i++) {
                array[i]= i;
                System.out.println(i);
            }
        }catch(Exception erro) {
            System.out.println("Occoreu um erro inesperado no metodo 2 !!");
        }
        System.out.println("Continuando...");
    }
}
