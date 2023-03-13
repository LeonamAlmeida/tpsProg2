package exercicio_08;

public class IntegerSet {
	
	public IntegerSet() {}
	
	private static int TAM = 201;
	public boolean[] conjunto = new boolean[TAM];
	
	private IntegerSet(boolean valores[]) {
		this.conjunto = valores;
	}
	
	public IntegerSet intersec(IntegerSet outro) {
        boolean intersect[] = new boolean[TAM];
        for (int i = 0; i < TAM; i++) {
            intersect[i] = this.conjunto[i] && outro.conjunto[i];
        }
        return new IntegerSet(intersect);
    }
	
	public IntegerSet uniao(IntegerSet outro) {
        boolean sup1[] = new boolean[TAM];
        for (int i = 0; i < TAM; i++) {
            sup1[i] = this.conjunto[i] || outro.conjunto[i];
        }
        return new IntegerSet(sup1);
    }
	
	public void inserirElemento(int pos) {
        this.conjunto[pos] = true;
    }
	
	public void deletarElemento(int pos) {
        this.conjunto[pos] = false;
    }
	
	public String toString() {
        StringBuilder sup2 = new StringBuilder();
        for (int i = 0; i < TAM; i++) {
            if (this.conjunto[i]) { 
                if (sup2.length() == 0) {
                    sup2.append(i);
                } else {
                    sup2.append(" ").append(i);
                }
            }
        }
        return sup2.length() == 0 ? "Não intersecta" : sup2.toString();
    }
	
	public boolean ehIgual(IntegerSet outro) {
        for (int i = 0; i < TAM; i++) {
            if (this.conjunto[i] != outro.conjunto[i]) {
                return false;
            }
        }
        return true;
	}
}
