package Unidade1;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura(){
        return largura;
    }
    public double getAltura(){
        return altura;
    }

    public double calcularArea(){
        return getLargura() * getAltura();
    }

    public static void main(String[] args){
        Retangulo area = new Retangulo(5, 5);

        System.out.println("área: " +area.calcularArea());
    }
}
