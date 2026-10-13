package POO;

public class Encapsulamento {//o encapsulametno é um conceito que visa proteger os dados de uma classe
    private double balance = 0;//aqui o atributo balance é privado, ou seja, não pode ser acessado diretamente de fora da classe
    public void deposit(double x){//método responsável por alterar o valor do atributo, pois quem está dentro dessa classe pode acessar o atributo balance
        if(x > 0){//antes da alteração, é feita uma verificação pra que após isso o atributo possa ser acessado e alterado
            balance += x;
        }
    }
}
