package POO;

public class Estatico {
    public static int COUNT = 0; //aqui a variável vai ser compartilhada entre todos os objetos da mesma classe
    public void Counter(){
        COUNT++;//aqui a variável estática vai ser incrementada a cada vez que um novo objeto for criado
    }

    public static void main(String[] args){
        Estatico c1 = new Estatico();
        Estatico c2 = new Estatico();
        System.out.println(Estatico.COUNT);
    }
}
