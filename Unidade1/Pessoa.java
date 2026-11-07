package Unidade1;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public boolean isMaiorDeIdade(){
        if(getIdade() <= 18){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe seu nome e idade:");
        String Nome = sc.nextLine();
        int Idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(Nome, Idade);

        System.out.println("NOME: " +pessoa.getNome() +"\nIDADE: " +pessoa.getIdade() +"\nMAIOR DE IDADE? " +pessoa.isMaiorDeIdade());

        sc.close();
    }
}
