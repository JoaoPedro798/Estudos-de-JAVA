package Unidade2.formas;

public abstract class Forma {
    private String nome;

    public Forma(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public abstract double calcularArea();//essa linha diz pras subclasses de que usem suas próprias implementações do método calcularArea() 

    public boolean ehMaiorQue(Forma outra){//aqui analisa se a área é maior que a área da outra forma
        return calcularArea() > outra.calcularArea();
    }

    @Override//ele é um aviso de vai estar redefinindo um método padrão do Java da classe Object
    public String toString() {
        return this.nome + " - Area: " + calcularArea();
    }
}
