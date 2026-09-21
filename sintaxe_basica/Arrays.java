public class arrays{
    public static void main(String[] args){
        int[] n = new int[5];
        n[0] = 10;
        n[1] = 20;

        System.out.println("primeiro valor: " +n[0] +" e segundo valor: " +n[1]);

        //pra usar um loop, usar length pra descobrir o tamanho do array.
        int [] idade = {18, 33, 24, 64, 45};

        System.out.println("quantidade de itens do array: " +idade.length);

        System.out.println("");

        //como utilizar no loop:
        for(int i = 0; i < idade.length; i++){
            System.out.println(idade[i]);
        }

        System.out.println("");

        //pra ficar mais curto e fácil pra ler, usar o for-each:
        //nesse loop, a variável j foi criada e automaticamente atribuída a cada valor do array
        for(int j: idade){
            System.out.println(j);
        }

        System.out.println("");


        //arrays multidimensionais

        int [][] m = {{10, 20, 30}, {40, 50, 60}};
        System.out.println(m[0][2]);
        //aqui ele escolhe um elemento de um desses dois arrays
    }
}