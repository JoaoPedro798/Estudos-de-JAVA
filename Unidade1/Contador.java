package Unidade1;

public class Contador {
    private int limite;

    public Contador(int limite){
        this.limite = limite;
    }

    public int getLimite(){
        return limite;
    }

    public void contarAte(){
        for(int i = 1; i <= getLimite(); i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Contador n = new Contador(10);
        n.contarAte();
    }
}
