package exercícios;

public class exercicio3 {
    public static void main(String[] args){
        int a = 5;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean cond1 = a > b;
        boolean cond2 = b > 10;

        System.out.println(cond1 && cond2);
        //no &&, os dois tem que ser verdadeiro pra ser verdadeiro, se um for e o outro não, o resultado é falso
        
        System.out.println(cond1 || cond2);
        //no ||, apenas um precisa ser verdadeiro pra ser verdadeiro

        System.out.println(!cond1);
        //no !, ele inverte a operação relacional (V vira F, F vira V)
    }
}
