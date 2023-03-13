package exercicio_01;

public class AppTeste {
	
	public static void main(String[] args){

        Peixe p1 = new Peixe("Fizz");
        Cachorro c1 = new Cachorro("Nasus");

        p1.setPeso(5.6);
        p1.setTipoHabitat("Aquático");

        c1.setPeso(30.7);
        c1.setRaca("Dobermann");

        System.out.println(p1.toString());
        System.out.println(c1.toString());
    }
}
