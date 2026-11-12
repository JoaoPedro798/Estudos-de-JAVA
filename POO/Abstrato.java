package POO;

/*o conceito de abstração é quando se foca nas qualidades essenciais e não nas específicas, por exemplo,
quando ouvimos o termo livro, nós não sabemos suas qualidades específicas, mas uma ideia do livro, isso
se chama Abstração
obs: classe abstrata não pode ser instanciada*/

public abstract class Abstrato {
    /*
    .
    .
    .
    atributos e métodos da classe abstrata da classe Abstrato
    .
    .
    . */
    class Cat extends Abstrato {
    public void makeSound() {
        System.out.println("Meow");
    }
}
/*quando for instanciar, usar o construtor da subclasse Cat.
*/
    
}
