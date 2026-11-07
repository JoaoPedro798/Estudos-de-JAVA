package Unidade2;

import java.util.ArrayList;

public class ListaCompras {
    private ArrayList<String> itens;

    public ListaCompras(){
        this.itens = new ArrayList<>();//aqui ela está pronta pra receber os textos
    }

    public void adicionarItem(String item){
        if(this.itens.contains(item)){//aqui verifica se itens está contido dentro do arraylist item
            System.out.println(item +" já está na lista");
        }else{
            this.itens.add(item);//aqui o método .add() vai adicionar o item no final da lista e adicionar 1 na posição
        }
    }

    public void removerItem(String item){
        if(!this.itens.remove(item)){//ela diz: "se este item não foi removido..."
            System.out.println(item +" não está na lista");
        }
    }

    public void substituirItem(int posicao, String novoItem){//aqui vai dizer em qual posição que será colcado um novo item para substituir
        if(posicao < 0 || posicao >= this.itens.size()){//condição 1: olha se tentaram passar um índice negativo. condição 2: testa se acessar um índice igual ou maior que a quantidade de itens presenstes na lista
            System.out.println("posição inválida: " +posicao);
        }else{
            this.itens.set(posicao, novoItem);//aqui o novo item vai ser gravado na posição indicada
        }
    }

    public void moverParaTopo(String item){
        if(this.itens.remove(item)){//aqui o item vai ser removido e adicionado no início da lista
            this.itens.add(0, item);
        }else{
            System.out.println(item +" não está na lista");
        }
    }

    public int quantidadeItens(){
        return this.itens.size();
    }

    public void limpar(){
        this.itens.clear();//aqui vai remover todos os itens da lista
    }

    public void exibir(){
        if(this.itens.isEmpty()){//aqui verifica se se a lista itens está vazia
            System.out.println("lista vazia");
        }else{
            for(int i = 0; i < this.itens.size(); i++){
                System.out.println(i +" - " +this.itens.get(i));
            }
        }
    }

     public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();
        lista.adicionarItem("Arroz");
        lista.adicionarItem("Feijao");
        lista.adicionarItem("Cafe");
        lista.adicionarItem("Leite");
        lista.adicionarItem("Arroz");
        lista.exibir();
        System.out.println("Total de itens: " + lista.quantidadeItens());

        System.out.println();
        lista.removerItem("Cafe");
        lista.removerItem("Acucar");
        lista.substituirItem(0, "Arroz integral");
        lista.substituirItem(5, "Pao");
        lista.exibir();
        System.out.println("Total de itens: " + lista.quantidadeItens());

        System.out.println();
        lista.moverParaTopo("Leite");
        lista.moverParaTopo("Pao");
        lista.exibir();

        System.out.println();
        lista.limpar();
        lista.exibir();
    }
}

