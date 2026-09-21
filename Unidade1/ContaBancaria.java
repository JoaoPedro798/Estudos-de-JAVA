package Unidade1;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        //aqui ele vai pegar o saldo que tá guardado e vai somar com o valor que será depositado e depois usar o set pra redefinir
    }

    public void sacar(double valor){
        if(valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
        }else{
            System.out.println("saldo insuficiente");
        }
    }

    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("joao", 1500);
        conta.depositar(500);
        conta.sacar(100);
        System.out.println("valor final: " +conta.getSaldo());
    }
}
