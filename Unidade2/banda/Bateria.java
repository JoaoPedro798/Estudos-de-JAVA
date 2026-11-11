package Unidade2.banda;

public class Bateria extends Instrumento {
    public Bateria(String nome){
        super(nome);//aqui o construtor da superclasse é invocado pra utilizar seu parâmetro
    } 

    @Override//aviso de que o método vai ter seu retorno personalizado
    public String getFamilia(){
        return "percussão";
    }

    @Override 
    public void tocar(){
        System.out.println(getNome() +": tum tum ta!");
    }
}
