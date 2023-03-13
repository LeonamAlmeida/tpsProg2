package Exercicio_02;

public enum Player {

    EMPTY ('-'),PLAYER_ONE ('X'), PLAYER_TWO ('O');

    public final char valor;

    Player(char opcao) {
        this.valor = opcao;
    }

    public char getValor() {
        return valor;
    }
}
