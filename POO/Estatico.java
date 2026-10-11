package POO;

public class Estatico {
    public static int COUNT = 0;
    public void Counter(){
        COUNT++;
    }

    public static void main(String[] args){
        Estatico c1 = new Estatico();
        Estatico c2 = new Estatico();
        System.out.println(Estatico.COUNT);
    }
}
