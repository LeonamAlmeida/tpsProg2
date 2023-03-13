package exercicio_04;

public class Bicicleta extends Veiculo{

    public Bicicleta(){
        System.out.println();
        System.out.println("---Bicicleta---");
        System.out.println("---------------");
    }
    @Override
    public void listarVerificacoes() {
        System.out.println("Encher pneu dianteiro");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustando bicicleta");
    }

    @Override
    public void limpar() {
        System.out.println("Limpando bicicleta");
    }
}
