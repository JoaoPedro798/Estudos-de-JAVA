package Unidade1;

import java.util.Scanner;

public class Matriz {
    private int[][] valores;

    public Matriz(int[][] valores){
        this.valores = valores;
    }
    
    public int[][] getValores(){//assim que coloca no método getter
        return valores;
    }
    public void setValores(int[][] valores){
        this.valores = valores;
    }

    public void imprimir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(getValores()[i][j] + " |");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] valor = new int[3][3];//essa linha retrata uma linha de alocação de memória pra fazer a matriz

        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                System.out.println("informe o valor da linha: " +a +" e da coluna: " +b);
                valor[a][b] = sc.nextInt();
            }
        }

        Matriz matriz = new Matriz(valor);//essa linha cria o objeto que irá utilizar o espaço alocado
        matriz.imprimir();

        sc.close();
    }
}
