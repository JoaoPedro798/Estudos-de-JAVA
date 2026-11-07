package POO;

public class Estatico {
    public static int COUNT = 10;//aqui a variável vai ser compartilhada entre todos os objetos da mesma classe
    public void Counter(){
        COUNT++;//aqui a variável estática vai ser incrementada a cada vez que um novo objeto for criado
    }
    public static void horn(){// ao criar um método estático, não precisa criar um objeto pra chamar o método
        System.out.println("Beep");
    }

    public static void main(String[]args){
        Estatico.horn();//chamando o método estático sem criar um objeto
        System.out.println(Estatico.COUNT);
    }
}