package Unidade2.ingressos;

public abstract class Ingresso {
    private String evento;
    private double precoBase;

    public Ingresso(String evento, double precoBase) {
        this.evento = evento;
        this.precoBase = precoBase;
    }

    public String getEvento(){
        return this.evento;
    }

    public double getPrecoBase(){
        return this.precoBase;
    }

    public abstract String getTipo();
    /*como não existe apenas ingresso, o programa precisa saber o tipo de ingresso */

    public abstract double calcularPreco();
    /*como o ingresso não tem um preço universal, os tipos de ingressos que vão ser informados
    nas subclasses também informarão seus diferentes preços relacionados aos tipos  */

     @Override//aqui ele avisa que não é um método qualquer, e que vai ter o retorno personalisado e não o padrão da superclasse Object
    public String toString() {
        return getTipo() + " - " + this.evento + ": R$ " + calcularPreco();
    }
}