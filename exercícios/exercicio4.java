package exercícios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe suas duas notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;

        System.out.println("média: " +media);
        
        sc.close();
    }
}
