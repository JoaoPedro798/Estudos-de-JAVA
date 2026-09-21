package exercícios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("iforme seu nome, idade e altura: ");
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double altura = sc.nextDouble();

        System.out.println("Olá, " +nome +"! Você tem " +idade +" anos e " +altura +"m de altura.");

        sc.close();
    }
}
