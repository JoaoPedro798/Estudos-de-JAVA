package Unidade2.banda;

public class Violao extends Instrumento {//aqui a subclasse Violao vai herdar os atributos e métodos da superclasse Instrumento
    public Violao(String nome){
        super(nome);//aqui o construtor da superclasse é invocado pra utilizar seu parâmetro
    }

    @Override
    public String getFamilia(){
        return "cordas";
    }

    @Override 
    public void tocar(){
        System.out.println(getNome() +": plim plim plim");
    }
}
