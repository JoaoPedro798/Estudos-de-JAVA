package POO;

public class Estatico {
    public static void horn(){// ao criar um método estático, não precisa criar um objeto pra chamar o método.
        System.out.println("Beep");
    }

    public static void main(String[]args){
        Estatico.horn();//chamando o método estático sem criar um objeto.
    }
}