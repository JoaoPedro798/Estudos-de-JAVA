//primeiro tem que importar a classe correspondente

import java.util.Scanner;

//após importar, tem que criar um onjeto Scanner

public class Entrada{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //objeto Scanner criado!
        System.out.print("informe um nome: ");
        String nome = sc.nextLine(); //aqui o programa congela esperando o usuário digitar algo e depois clicar em enter
        System.out.print("informe sua idade: ");
        int idade = sc.nextInt();
        System.out.println("nome: " +nome +" e idade: " +idade); //essa é a forma para imprimir mais de uma variável
        sc.close(); // aqui o sistema operacional fez uma reserva de memória mas eu não estou usando mais, aí este comando fecha essa reserva.
    }
}

/*
nextLine = string
nextInt = inteiro
nextDouble = decimal
 */