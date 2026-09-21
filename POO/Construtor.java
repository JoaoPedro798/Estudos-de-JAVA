package POO;

/*
Construtor: é como se fosse um método onde:
- tem que ter o mesmo nome da classe;
- não deve ter retorno (void, String ou int);
- assim que um objeto nasce, ele vai carregar essa informação
- o construtor é chamado quando usa a palavra new
*/

public class Construtor {
    private String cor;
    private String marca;
    Construtor(){
        cor = "azul";
        marca = "FIAT";
    }
}
