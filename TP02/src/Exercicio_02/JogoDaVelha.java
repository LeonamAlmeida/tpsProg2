package Exercicio_02;
import java.util.*;

public class JogoDaVelha {
	
	public static final int TAM = 3;
    char[][] tabuleiro = new char [TAM][TAM];

    public JogoDaVelha() {
        for (int i = 0; i < TAM; i ++) {
            for (int j = 0; j < TAM; j ++) {
                this.tabuleiro[i][j] = '-';
            }
        }
    }

    public void imprimeTabuleiro() {
        for (int i = 0; i < TAM; i ++) {
            for (int j = 0; j < TAM; j ++) {
                System.out.print("[ " + tabuleiro[i][j] + " " + "]");
            }
            System.out.println();
        }
    }

    public boolean validar(int linha, int coluna) {
        if(tabuleiro[linha][coluna] != '-' && linha < 3 && coluna < 3) {
            System.out.println("Jogada invalida!");
            return false;
        }else{
            return true;
        }
    }

    public void jogada (Player player, int linha, int coluna) {
        if( tabuleiro[linha][coluna] == '-') {
            if(player == Player.PLAYER_ONE) {
                tabuleiro[linha][coluna] = 'X';
            }else if(player == Player.PLAYER_TWO) {
                tabuleiro[linha][coluna] = 'O';
            }
        }
    }

    public void vCampeao() {
        if(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X'
                || tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X'
                || tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X'
                || tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X'
                || tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X'
                || tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X'
                || tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println(" O jogador 1 venceu!");
            System.exit(0);

        }
        if(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O'
                || tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O'
                || tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O'
                || tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O'
                || tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O'
                || tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O'
                || tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println(" O jogador 2 venceu!");
            System.exit(0);

        }
        if (tabuleiro[0][0] != '-' && tabuleiro[0][1] != '-' && tabuleiro[0][2] != '-'
                && tabuleiro[1][0] != '-' && tabuleiro[1][1] != '-' && tabuleiro[1][2] != '-'
                && tabuleiro[2][0] != '-' && tabuleiro[2][1] != '-' && tabuleiro[2][2] != '-') {
            System.out.println("!!!! Empate !!!!");
            System.exit(0);
        }

    }

    public void iniciar() {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        @SuppressWarnings("unused")
		int linha, coluna, contador = 0, jogador;
        boolean valida;

        System.out.println("Diagrama: ");
        System.out.println("Colunas : 0 1 2 \nLinha:  0 - - - \nLinha:  1 - - -  \nLinha:  2 - - - ");
        System.out.println();

        while (contador == 0) {
            jogador = 1;
            do {
                System.out.println("Jogador 1 sua vez!");
                System.out.println("Linha: ");
                linha = scan.nextInt();
                System.out.println("Coluna: ");
                coluna = scan.nextInt();
                valida = validar(linha, coluna);
                if (valida) {
                    jogada(Player.PLAYER_ONE, linha, coluna);
                }
                System.out.println();
            }while(!valida);
            jogador = 2;
            imprimeTabuleiro();
            System.out.println();
            vCampeao();
            do {
                System.out.println("Jogador 2 sua vez!");
                System.out.println("Linha: ");
                linha = scan.nextInt();
                System.out.println("Coluna: ");
                coluna = scan.nextInt();
                valida = validar(linha, coluna);
                if (valida) {
                    jogada(Player.PLAYER_TWO, linha, coluna);
                }
                System.out.println();
            }while(!valida);
            imprimeTabuleiro();
            System.out.println();
            vCampeao();
        }
    }
}
