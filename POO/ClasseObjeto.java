package POO;// como estou criando programas separados em pastas dentro da pasta java, o package é obrigatório pra organizar

class animal{
    void bark(){
        System.out.println("woof-woof");
    }
}
public class ClasseObjeto {
    public static void main(String[] args){
        animal dog = new animal();//objeto dog criado
        dog.bark();//objeto dog do método bark da classe animal
    }
}
