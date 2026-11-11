package Unidade2.veiculos;

public class Carro extends Veiculo {//aqui diz que a classe Carro vai herdar os atributos e métodos da superclasse Veiculo
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, double valor, int numeroPortas){
        super(marca, modelo, ano, valor);//aqui o construtor da superclasse é invocado
        this.numeroPortas = numeroPortas;
    }//aqui esse construtor vai aproveitar o uso dos atributos da superclasse juntamente com o atributo da sua classe

    public int getNumeroPortas(){
        return this.numeroPortas;
    }

    @Override//aqui avisa que irá personalisar a representação em texto
    public String toString(){
        return super.toString() +"\nPortas: " +this.numeroPortas;//aqui ele vai juntar o método toString da superclasse com essa
    }
}