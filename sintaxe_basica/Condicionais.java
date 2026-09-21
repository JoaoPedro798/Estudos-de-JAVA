import java.util.Scanner;

public class condicionais{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("informe sua idade: ");
        int n = sc.nextInt();
        if(n >= 18){
            System.out.println("maior de idade");
        }else{
            System.out.println("menor de idade");
        }
        sc.close();
    }
}