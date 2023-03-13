package exercicio_08;

public class Main {

    public static void main(String[] args){

        int teste, teste2;
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        try {
            teste = numeros[3];
            teste2 = numeros[0] / 0;
        } catch (Exception e){
            System.out.println("!*!*!*!");
            e.printStackTrace();
        }
    }
}
