package Unidade2.banco;

public class Conta {
     private String titular;
    private double saldo;

    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){ 
        return this.saldo; 
    }

    public void depositar(double valor){
        this.saldo += valor;//aqui vai ser somado o saldo atual com o valor que o usuário irá informar
    }

    public double saldoDisponivel(){
        return this.saldo;//mostra o quanto a conta pode gastar
    }

    public boolean sacar(double valor){//esse método vai dizer se é possível sacar um certo valor da conta
        if (valor > saldoDisponivel()){
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transferir(Conta destino, double valor){
        if (sacar(valor)){//esse método vai dizer se é possível sacar um certo valor da conta, se for, deposita na conta de destino
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override//ele avisa que o que irá retornar está personalisado e não a forma padrão da superclasse Object
    public String toString(){
        return this.titular + ": R$ " + this.saldo;
    }
}
