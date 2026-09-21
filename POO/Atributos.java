package POO;

class veiculo{
    int velocidade;
    int rodas;
    String cor;
    double gasolina;

    void buzina(){
        System.out.println("beep");
    }
}

public class Atributos {//atributos são variáveis dentro de uma classe
    public static void main(String[] args){
        veiculo carro1 = new veiculo();
        veiculo carro2 = new veiculo();

        carro1.cor = "verde";
        carro2.cor = "azul";

        System.out.println("carro 1: " +carro1.cor);
        System.out.println("carro2: " +carro2.cor);
        carro2.buzina();
    }
}
