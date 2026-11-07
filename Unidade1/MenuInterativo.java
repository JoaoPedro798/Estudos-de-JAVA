package Unidade1;

import java.util.Scanner;

public class MenuInterativo {
    private double numero1;
    private double numero2;

    public double getNumero1(){
        return numero1;
    }
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }

    public double getNumero2(){
        return numero2;
    }
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }

    public double somar(){
        return getNumero1() + getNumero2();
    }
    public double subtrair(){
        return getNumero1() - getNumero2();
    }
    public double multiplicar(){
        return getNumero1() * getNumero2();
    }
    public double dividir(){
        if(getNumero2() == 0){
            System.out.println("não é possível um divisor por 0");
            return 0;
        }else{
            return getNumero1() / getNumero2();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MenuInterativo n = new MenuInterativo();
        int opcao;

        do{//aqui ele vai fazer as operações e depois vai perguntar se deseja contiuar
            System.out.println("1 pra somar\n2 pra subtrair\n3 pra multiplicar\n4 pra dividir\n0 pra sair");
            opcao = sc.nextInt();

            if(opcao >= 1 && opcao <= 4){
                System.out.println("informe seu primeiro e segundo número:");
                n.setNumero1(sc.nextDouble());
                n.setNumero2(sc.nextDouble());

                switch(opcao){
                    case 1:
                        System.out.println("resultado: " +n.somar());
                        break;
                    case 2:
                        System.out.println("resultado: " +n.subtrair());
                        break;
                    case 3:
                        System.out.println("resultado: " +n.multiplicar());
                        break;
                    case 4:
                        System.out.println("resultado: " +n.dividir());
                        break;
                }
            }else if(opcao != 0){
                System.out.println("valor inválido");
            }
        }while(opcao != 0);
        sc.close();
    }
}
