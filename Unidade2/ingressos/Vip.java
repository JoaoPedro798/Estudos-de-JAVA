package Unidade2.ingressos;

public class Vip extends Ingresso {
    private double adicional;

    public Vip(String evento, double precoBase, double adicional) {
        super(evento, precoBase);
        this.adicional = adicional;
    }

    public double getAdicional(){
        return this.adicional;
    }

    @Override//ele é um aviso de vai estar redefinindo um método que foi declarado na classe pai
    public String getTipo() {
        return "VIP";
    }

    @Override//ele é um aviso de vai estar redefinindo um método que foi declarado na classe pai
    public double calcularPreco() {
        return getPrecoBase() + this.adicional;
    }
}
