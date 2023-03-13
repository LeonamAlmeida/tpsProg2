package exercicio_04;

import java.util.*;

public class Oficina {

    Random rdm = new Random(); // randomizar

    public Veiculo proximo(){
        Veiculo v;
        int aux;
        aux = rdm.nextInt();
        if(aux % 2 == 0)       // par retorna automovel, impar, bicicleta
            v = new Automovel();
        else
            v = new Bicicleta();
        return v;
    }

    public void manutencao(Veiculo v){
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();
        if(v instanceof Automovel) {
            ((Automovel) v).mudarOleo();
        }
    }
}

