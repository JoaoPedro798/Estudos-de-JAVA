package POO;

//pra utilizar o arraylist é necessário importar a biblioteca java.util.ArrayList
import java.util.ArrayList;

public class ArrayDinamico {
    public static void main(String[] args){
    //como o arraylist é dinâmico, não é necessário definir o tamanho do array
    ArrayList<String> carros = new ArrayList<>();

    //o método .add() adiciona o elemento no final do array
    carros.add("Fusca");
    carros.add("Civic");
    carros.add("Corolla");
    //o método .get() retorna o elemento do array
    System.out.println("primeiro carro da lista: " +carros.get(0));

        //o método .size() retorna o tamanho do array
        System.out.println("tamanho do array: " +carros.size());

    //o método .remove() remove o elemento do array
    carros.remove("Fusca"); 

    System.out.println("novo total de carros após a remoção: " +carros.size());
    System.out.println("novo primeiro carro da lista: " +carros.get(0));
    }
}