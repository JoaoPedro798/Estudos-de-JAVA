package Unidade2.ingressos;

public class MeiaEntrada extends Ingresso{
    public MeiaEntrada(String evento, double precoBase) {
        super(evento, precoBase);
    }

    @Override//ele é um aviso de vai estar redefinindo um método que foi declarado na classe pai
    public String getTipo() {
        return "Meia-entrada";
    }

    @Override//ele é um aviso de vai estar redefinindo um método que foi declarado na classe pai
    public double calcularPreco() {
        return getPrecoBase() / 2;
    }
}
