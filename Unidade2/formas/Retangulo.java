package Unidade2.formas;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        super("Retangulo");
        this.largura = largura;
        this.altura = altura;
    }/*como um objeto da classe Retangulo já sabe que se trata de um retângulo, 
       o programador não precisar digitar a palavra retângulo a cada nova instância, 
       e com isso causar redundância*/

    public double getLargura(){
        return this.largura;
    }
    
    public double getAltura(){
        return this.altura;
    }

    @Override//irá mostrar o retorno personalisado
    public double calcularArea() {
        return this.largura * this.altura;
    }
}