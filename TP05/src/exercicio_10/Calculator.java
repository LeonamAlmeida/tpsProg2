package exercicio_10;

public class Calculator {

    public double a, b, c;

    public double div(double a, double b) throws InvalidOperationException{ // a = num, b = denom
        if(b == 0){
            throw new InvalidOperationException("Erro, divisor = 0");
        }
        return a/b;
    }
    public double log10(double c) throws InvalidOperationException{
        if(c < 0){
            throw new InvalidOperationException("Erro, z < 0");
        }
        else if(c == 0){
            throw new InvalidOperationException("Erro, z = 0");
        }
        return Math.log(10) / Math.log(c);
    }
}
