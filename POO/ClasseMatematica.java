package POO;

public class ClasseMatematica {
    //a classe Math é uma classe que fornece métodos predefinidos pra operações matemáticas

    public static void main(String[] args){
        int a = Math.abs(10);
        System.out.println("Math.abs(10): " +a);

        int b = Math.abs(-20);
        System.out.println("Math.abs(-20):" +b);
        //Math.abs() retorna o valor absoluto do seu parâmetro

        System.out.println("");

        double c = Math.ceil(7.342);
        System.out.println("Math.ceil(7.342): " +c);
        //Math.ceil() retorna pro valor inteiro mais próximo, o valor arrendondado é retornado como double

        System.out.println("");

        double f = Math.floor(7.343);
        System.out.println("Math.floor(7.343): " +f);
        //Math.floor() arredonda o valor flutuante e retorna o valor inteiro mais próximo

        System.out.println("");

        int m = Math.max(10, 20);
        System.out.println("Math.max(10, 20): " +m);
        //Math.max() retorna o maior dos seus parâmetros

        System.out.println("");

        int n = Math.min(10, 20);
        System.out.println("Math.min(10, 20): " +n);
        //Math.min() retorna o menor parâmetro

        System.out.println("");

        double p = Math.pow(2, 3);
        System.out.println("Math.pow(2, 3): " +p);
        //Math.pow() aqui ele pega o primeiro parâmetro e eleva ao valor do segundo parâmetro
    }
}