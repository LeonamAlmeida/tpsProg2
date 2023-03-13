package exercicio_06;

public class Conta {

    public double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void depositar(double valor) throws ContaExcecao{
        if(valor < 0){
            throw new ContaExcecao("Erro, deposito menor que 0");
        } else
            this.saldo = saldo + valor;
    }
    public void sacar(double valor) throws ContaExcecao{
        if(valor > this.saldo){
            throw new ContaExcecao("Erro, saque maior que o saldo");
        } else
            this.saldo = saldo - valor;
    }
}
