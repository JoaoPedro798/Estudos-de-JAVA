package Unidade2.banda;

public class Flauta extends Instrumento {
    public Flauta(String nome){
        super(nome);//aqui o construtor da superclasse é invocado pra utilizar seu parâmetro
    }

    @Override 
    public String getFamilia(){
        return "sopro";
    }

    @Override 
    public void tocar(){
        System.out.println(getNome() +": fiu fiu fiuuu");
    }
}
