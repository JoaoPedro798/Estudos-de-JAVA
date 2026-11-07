package Unidade1;

import java.util.Scanner;

public class NumeroPrimo {
    private int numero;

    public NumeroPrimo(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public boolean verificarPrimo(){
        if(getNumero() < 2){
            return false;
        }
        for(int i = 2; i < getNumero(); i++){
            if(getNumero() % i == 0){
                return false;
            }
        }return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um número: ");
        int a = sc.nextInt();

        NumeroPrimo p = new NumeroPrimo(a);

        p.verificarPrimo();

        System.out.println("é primo? " +p.verificarPrimo());

        sc.close();
    }
}
