import java.util.Scanner;

public class While{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um número:");
        int n = sc.nextInt();
        int i = 1;

        System.out.println();
        while(i <= n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}

/*
i + 1 = i++
i - 1 = i--
*/