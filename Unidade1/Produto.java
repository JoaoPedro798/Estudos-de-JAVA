package Unidade1;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public static void main(String[] args){
        Produto produto1 = new Produto("teclado", 100, 50);
        Produto produto2 = new Produto("mouse", 120, 25);

        System.out.println("produto 1: " +produto1.getNome() +"; preço: " +produto1.getPreco() +"; quantidade: " +produto1.getQuantidade());
        System.out.println("");
        System.out.println("produto 2: " +produto2.getNome() +"; preço: " +produto2.getPreco() +"; quantidade: " +produto2.getQuantidade());
    }
}
