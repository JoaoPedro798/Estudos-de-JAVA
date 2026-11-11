package Unidade2.veiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double valor, int cilindradas){
        super(marca, modelo, ano, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return this.cilindradas;
    }

    @Override
    public double calcularIPVA(){
        if(this.cilindradas <= 160){
            return super.calcularIPVA() / 2;
        }
        return super.calcularIPVA();
    }//nesse método vai verificar se a moto tem até 160 cilindradas, se tiver 50% de desconto do IPVA, se não, vai pagar o preço cheio

    @Override 
    public String toString(){
        return super.toString() +"\nCilindradas: " +this.cilindradas;
    }
}
