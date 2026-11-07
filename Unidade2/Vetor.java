package Unidade2;

import java.util.Scanner;

public class Vetor {
    private int[] Valores;

    public Vetor(int[] Valores){
        this.Valores = Valores;
    }

    public void exibir(){
        for(int i = 0; i < this.Valores.length; i++){
            System.out.print(" " +this.Valores[i]);
        }
        System.out.println();
    }

    public int buscarPosicao(int valor){
        for(int i = 0; i < this.Valores.length; i++){
            if(this.Valores[i] == valor){//aqui vai verificar se o valor que está no vetor é igual ao valor que foi passado como parâmetro
                return i;
            }
        }
        return -1;
    }

    public boolean estaOrdenado(){
        for(int i = 0; i < this.Valores.length - 1; i++){//aqui a penúltima posição do vetor será comparada com a última posição do vetor
            if(this.Valores[i] > this.Valores [i + 1]){//aqui vai verificar se o atual é maior que o próximo
                return false;
            }
        }
        return true;
    }

    public void inverter(){
        int inicio = 0;//posição inicial do vetor
        int fim = this.Valores.length - 1;//marca a última posição do vetor
        while(inicio < fim){
            int aux = this.Valores[inicio];
            this.Valores[inicio] = this.Valores[fim];
            this.Valores[fim] = aux;
        inicio++;
        fim--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("quantos valores deseja inserir? ");
        int quantidade = sc.nextInt();
        int[] dados = new int[quantidade];//quantidade vai dizer quantos valores do tipo inteiro vai ter

        for(int i = 0; i < quantidade; i++){
            System.out.print("digite o valor da posição " +i +" do vetor: ");
            dados[i] = sc.nextInt();
        }

        Vetor v = new Vetor(dados);
        v.exibir();
        System.out.println("está ordenado? " +v.estaOrdenado());

        System.out.print("valor a ser buscado: ");
        int busca = sc.nextInt();

        int posicao = v.buscarPosicao(busca);
        if(posicao == -1){
        
            System.out.println(busca +" não foi encontrado");
        }else{
            System.out.println(busca +" foi encontrado na posição " +posicao);
        }

        System.out.println("invertendo o vetor...");
        v.inverter();
        v.exibir();
        System.out.println("Esta ordenado?" +v.estaOrdenado());

        sc.close();
    }
    }
