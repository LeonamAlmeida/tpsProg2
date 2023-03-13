package exercicio_02;

public class AppTeste {

    public static void main(String[] args){

        DiaDosNamorados d1 = new DiaDosNamorados("Julia");
        d1.showMessage();

        Natal n1 = new Natal("João");
        n1.showMessage();

        Aniversario a1 = new Aniversario("Maria");
        a1.showMessage();
    }
}
