public class Returnmetodo {

    static double perc(double num, int porcentagem){
        double resultado = num * porcentagem / 100;
        return resultado;
    }
    public static void main(String[] args){
        double x = perc(530, 23);
        System.out.println("resultado: " +x);
        //nesse novo caso, declara uma variável do mesmo tipo do método
        //essa variável vai receber a chamada da função
    }
}
