import java.util.Scanner;

public class Switchs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um número: (de preferência 1 a 3).");
        int n = sc.nextInt();

        if (n == 1 || n == 2 || n == 3){
            switch(n){
                case 1:
                    System.out.println("primeiro lugar");
                    break;
                case 2:
                    System.out.println("segundo lugar");
                    break;
                case 3:
                    System.out.println("terceiro lugar");
                    break;
            }
        }else{
            System.out.println("informe um valor válido");
        }
        sc.close();
    }
}