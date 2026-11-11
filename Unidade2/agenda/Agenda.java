package Unidade2.agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contato> contatos;//dentro dos <> diz o tipo de instâncias que a lista vai aceitar

    public Agenda(){//como a própria classe já sabe que o que fazer (armazenar as instâncias de Contato), ela não pede nada ao usuário
        this.contatos = new ArrayList<>();//aqui diz que o atributo contatos vai receber uma nova instância de um arraylist vazio que vai armazenar instâncias da classe Contato
    }

    public Contato buscarPorNome(String nome){
        for(Contato c : this.contatos){
            //aqui o laço for percorre a lista (this.contatos) elemento por elemento.
            //a cada volta, c armazena o nome do contato que será analisado
            if(c.getNome().equals(nome)){//aqui verifica se o nome do contato que está sendo analisado no momento é igual ao nome informado no parâmetro
                return c;
            }
        }
        return null;
    }

    public void adicionarContato(Contato c){//aqui vai receber como parâmetro o objeto da classe contato (irá conter nome e telefone)
        if(buscarPorNome(c.getNome()) != null){
            System.out.println(c.getNome() +" já está na agenda");
        }else{
            this.contatos.add(c);
        }
    }

    public void ListarContatos(){
        for(Contato c : this.contatos){//aqui ele vai percorrer a lista e mostrar um por um
            System.out.println(c);
        }
    }

    public void removerContato(String nome){//recebe o nome vindo do usuário
        Contato c = buscarPorNome(nome);//ao invés de usar um for, o método utiliza o método buscarNome()
        if(c != null){
            this.contatos.remove(c);
            System.out.println(nome +" removido(a) da agenda");
        }else{
            System.out.println(nome +" não está na agenda");
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("Ana", "(84) 99999-1111"));
        agenda.adicionarContato(new Contato("Bruno", "(84) 98888-2222"));
        agenda.adicionarContato(new Contato("Carla", "(84) 97777-3333"));
        agenda.adicionarContato(new Contato("Ana", "(84) 96666-4444"));
        agenda.ListarContatos();

        System.out.println();
        agenda.removerContato("Bruno");
        agenda.removerContato("Daniel");
        agenda.ListarContatos();
    }
}
