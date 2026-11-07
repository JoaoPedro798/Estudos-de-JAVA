package POO;

class Animal{
    protected int legs;//o modificador protected permite que o atributo seja acessado e modificado
    public void eat(){
        System.out.println("animal eats");
    }
}

class Dog extends Animal{//a subclasse Dog herda os atributos e métodos da superclasse Animal
    Dog(){
        legs = 4;
    }
}

public class Heranca {//a herança permite que uma classe adquira as propriedades de outra classe
    public static void main(String[] args){
        Dog d =  new Dog();
        d.eat();
    }
}
