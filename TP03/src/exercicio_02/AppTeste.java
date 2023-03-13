package exercicio_02;

public class AppTeste {
	
	public static void main(String[] args){

        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();
        Cliente c1 = new Cliente();

        g1.setNome("Fabio");
        g1.setIdade(35);
        g1.setMatricula("18.5.1111");
        g1.setNomeGerencia("O brabo");
        g1.setSalario(21100);

        v1.setNome("Rodrigo");
        v1.setSalario(3100);
        v1.setValorVendas(15800);
        v1.setQtdVendas(666);

        c1.setNome("Leticia");
        c1.setIdade(25);
        c1.setSexo("Feminino");
        c1.setValorDivida(12445);
        c1.setAnoNascimento(1995);

        System.out.println("#Gerente#");
        System.out.println(g1.toString());
        System.out.println("#Vendedor#");
        System.out.println(v1.toString());
        System.out.println("#Cliente#");
        System.out.println(c1.toString());
    }
}
