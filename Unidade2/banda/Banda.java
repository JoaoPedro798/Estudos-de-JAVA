package Unidade2.banda;

public class Banda {
    private String nome;//nome da banda
    private Instrumento[] instrumentos;//nome dos instrumentos usados na banda

    public Banda(String nome, Instrumento[] instrumentos){
        this.nome = nome;
        this.instrumentos = instrumentos;
    }

    public String getNome(){
        return this.nome;
    }

    public void apresentar(){//esse método vai os instrumentos pra tocar sequencialmente
        System.out.println("Banda " +this.nome +" tocando:");
        for(int i = 0; i < this.instrumentos.length; i++){
            this.instrumentos[i].tocar();
        }
    }

    public void solo(int posicao){//esse método vai tocar o solo de um único instrumento
        if(posicao < 0 || posicao >= this.instrumentos.length){
            System.out.println("Posição invalida: " +posicao);
        }else{
            System.out.println("Solo!");
            this.instrumentos[posicao].tocar();
        }
    }

    public int contarPorFamilia(String familia){//esse método vai dizer quantos instrumentos são da mesma família (categoria de instrumentos)
        int quantidade = 0;

        for(int i = 0; i < this.instrumentos.length; i++){
            if(this.instrumentos[i].getFamilia().equals(familia)){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static void main(String[] args){
        Instrumento[]instrumentos = {
            new Violao("Violão"),
            new Bateria("Bateria"),
            new Flauta("Flauta"),
            new Violao("Guitarra")
        };

        Banda banda = new Banda("Os objetos", instrumentos);

        banda.apresentar();
        System.out.println("Istrumentos de cordas: " +banda.contarPorFamilia("cordas"));
        System.out.println("Istrumentos de sopro: " +banda.contarPorFamilia("sopro"));

        System.out.println();
        banda.solo(1);
        banda.solo(2);
        //essas numerações são os índices dos instrumentos que fazerão o solo
    }
}