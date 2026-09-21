package POO;

class veiculomodificado{
    private String cor;;

    void horn(){
        veiculomodificado carro1 = new veiculomodificado();
        carro1.cor = "verde";
        System.out.println("cor do carro 1: " +carro1.cor);
        System.out.println("beep");
    }
}

//um modificador de acesso define o nível de acesso das classes, atributos e métodos
//public: pode ser acessado por qualquer outra classe
//private: atributo ou método só pode ser acessado dentro da classe onde ele foi criado
//protected: acesso liberado pra qualquer classe de um mesmo pacote
//default: aplicado pelo java quando não foi criado nenhuma palavra-chave de acesso antes de um atributo ou método
public class modificador {
    public static void main(String[] args){
        veiculomodificado carro = new veiculomodificado();
        carro.horn();
    }
}
