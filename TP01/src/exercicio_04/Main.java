package exercicio_04;

public class Main {

    public static void main(String[] args){

        int meses = 12;
        int semanas = 4;
        int somarMeses;
        int cadaSemana;
        int[][] valoresLoja = new int[meses][semanas];
        int sup = 0;
        int totalAno = 0;

        for(int i = 0; i < valoresLoja.length; i++){
            for(int j = 0; j < valoresLoja[i].length; j++){
                valoresLoja[i][j] = ((i + 2) * 100) + (j * 30); // gerando valores para as vendas, apenas pra nao digitar 48x
                System.out.print(valoresLoja[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------");
        System.out.println("Total vendido em cada mês:");
        System.out.println("--------------------------");
        for(int i = 0; i < meses; i++){
            somarMeses = 0;
            for(int j = 0; j < semanas; j++){
                somarMeses += valoresLoja[i][j];
                totalAno += valoresLoja[i][j];
            }
            System.out.println("Vendas mês " + (i+1) + " = " + somarMeses);
        }
        System.out.println("-----------------------------");
        System.out.println("Total vendido em cada semana:");
        System.out.println("-----------------------------");
        for(int i = 0; i < meses; i++){
            for(int j = 0; j < semanas; j++){
                cadaSemana = valoresLoja[i][j];
                sup++;
                System.out.println("Semana " + (sup) + " = " + cadaSemana);
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Total vendido no ano = " + totalAno);
        System.out.println("-----------------------------");
    }
}
