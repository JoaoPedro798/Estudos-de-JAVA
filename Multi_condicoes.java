import java.util.Scanner;

public class Multi_condicoes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe sua idade: ");
        int n = sc.nextInt();

        if (n >= 18 && n < 50){
            System.out.println("adulto");
        }else if (n < 18){
            System.out.println("informe uma idade maior ou igual a 18");
        }else{
            System.out.println("informe uma idade menor que 50");
        }
        sc.close();
    }
}

/*
&& = e
|| = ou
!= = diferente
== = igual
! = não. Torna a informação verdadeira em falsa
*/