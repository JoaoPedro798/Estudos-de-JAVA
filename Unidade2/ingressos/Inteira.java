package Unidade2.ingressos;

public class Inteira extends Ingresso {
    public Inteira(String evento, double precoBase) {
        super(evento, precoBase);
    }

    @Override//ele é um aviso de vai estar redefinindo um método que foi declarado na classe pai
    public String getTipo() {
        return "Inteira";
    }

    @Override//ele é um aviso de vai estar redefinindo um método que foi declarado na classe pai
    public double calcularPreco() {
        return getPrecoBase();
    }
}
