package POO;

/*
Getters e Setters são usados pra proteger os dados, ao criar as classes.
get: retorna o valor.
set: define o valor.
*/
class Veiculo{
    private String cor;

    String getCor(){
        return cor;
    }

    void setCor(String c){
        this.cor = c;//this se refere ao objeto atual.
    }
}

public class GetterSetter {
    public static void main(String[] args){
        Veiculo carro3 = new Veiculo();
        carro3.setCor("verde");
        System.out.println("cor do carro: " +carro3.getCor());
    }
}
