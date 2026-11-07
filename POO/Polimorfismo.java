package POO;

class Animal{
    public void makeSound(){
        System.out.println("Grr...");
    }
}

class Cat extends Animal{
    @Override //ele serve pra indicar que o método está sobrescrevendo um método da superclasse
    public void makeSound(){
        System.out.println("Meow...");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof");
    }
}

public class Polimorfismo {
    //o polimorfismo permite que os mesmos métodos das subclasses realizem ações diferentes
    public static void main(String[] args){
        Animal a = new Cat();
        Animal b = new Dog();

        a.makeSound();
        b.makeSound();
    }
}
