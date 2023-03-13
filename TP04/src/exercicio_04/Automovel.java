package exercicio_04;

public class Automovel extends Veiculo{

    public Automovel(){
        System.out.println();
        System.out.println("---AUTOMOVEL---");
        System.out.println("---------------");
    }

    @Override
    public void listarVerificacoes() {
        System.out.println("Calibrar, encher os pneus traseiros");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustando veiculo...");
    }

    @Override
    public void limpar() {
        System.out.println("Limpando veiculo...");
    }

    public void mudarOleo(){
        System.out.println("Mudando oleo");
    }
}

