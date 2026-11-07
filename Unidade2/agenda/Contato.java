package Unidade2.agenda;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    @Override//ele foi usado para sobrescrever o método toString() da classe Object, que é a superclasse de todas as classes em Java. Isso significa que quando você chama o método toString() em um objeto da classe Contato, ele vai retornar a representação personalizada definida nesse método, em vez da representação padrão fornecida pela classe Object.   
    public String toString(){//toString() é um método que retorna uma representação em forma de string do objeto.
        return this.nome + " - " +this.telefone;
    }
}
