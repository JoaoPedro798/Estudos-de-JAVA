package Unidade2.banda;

public class Instrumento {
    private String nome;

    public Instrumento(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getFamilia(){
        return "outros";//aqui vai estar retornando a categoria de instrumentos
    }//como esse programa não se refere a nenhuma categoria, vai retornar todos eles

    public void tocar(){
        System.out.println(this.nome +": som de instrumento");
    }
}
