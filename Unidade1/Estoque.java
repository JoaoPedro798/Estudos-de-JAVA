package Unidade1;

public class Estoque {
    private String nomeProduto;
    private int quantidadeMinima;
    private int quantidadeAtual;

    Estoque(String nomeProduto, int quantidadeMinima, int quantidadeAtual){
        this.nomeProduto = nomeProduto;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeAtual = quantidadeAtual;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public int getQuantidadeMinima(){
        return quantidadeMinima;
    }

    public int getQuantidadeAtual(){
        return quantidadeAtual;
    }
    public void setQuantidadeAtual(int quantidadeAtual){
        this.quantidadeAtual = quantidadeAtual;
    }

    public boolean precisaReabastecer(){
        return getQuantidadeAtual() < getQuantidadeMinima();
    }//esse método olha se a quantidade de produtos atual está menor que a quantidade mínima exigida.

    public void simularVendas(int dias, int vendasPorDia){
        for(int dia = 1; dia <= dias && getQuantidadeAtual() > 0; dia++){//enquanto o limite de dias não for atingido e o estoque não chegar a zero, o for continuará executando.
            setQuantidadeAtual(getQuantidadeAtual() - vendasPorDia);
            System.out.println("Dia" +dia +" - Estoque: " +getQuantidadeAtual());
        }
    }
    
    public static void main(String[] args){
        Estoque produto = new Estoque("parafuso", 20, 35);
        produto.simularVendas(10, 5);

        System.out.println("Precisa reabastecer? " +produto.precisaReabastecer());
    }
    }