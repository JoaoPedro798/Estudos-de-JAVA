package Unidade2;

public class Turma {
    //estão privados pois não podem ser acessados por outra classe
    private String nomeDisciplina;
    private String[] nomes;
    private double[] notasFinais;

    //construtor criado pois quando o objeto for instanciado, ele irá carregar essas informações
    public Turma(String nomeDisciplina, String[] nomes, double[] notasFinais){
        this.nomeDisciplina = nomeDisciplina;
        this.nomes = nomes;
        this.notasFinais = notasFinais;
    }

    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    public void exibir(){//como não tem um novo dado vindo de fora pra ser usado no momento da chamada, os parênteses ficam vazios
        for(int i = 0; i < this.notasFinais.length; i++){//aqui vai percorrer o vetor sem ultrapassar o tamanho do vetor 
            if(this.notasFinais[i] >= 7){//aqui vai estar verificando as notas finais de cada possição do vetor
               System.out.println("o aluno " +this.nomes[i] +" foi aprovado com a nota " +this.notasFinais[i]); 
            }else{
                System.out.println("o aluno " +this.nomes[i] + "foi reprovado com a nota " +this.notasFinais[i]);
            }
        }
    }

    public double calcularMedia(){
        double soma = 0;
        for(int i = 0; i < this.notasFinais.length; i++){
            soma += this.notasFinais[i];
        }
        return soma / this.notasFinais.length;
    }

    public int contarAcimaDaMedia(){//aqui vai retornar a quantidade de alunos que estão acima da média
        double media = calcularMedia();//a variável media vai receber o resultado da média do método calcularMedia
        int acima = 0;

        for(int i = 0; i < this.notasFinais.length; i++){
            if(this.notasFinais[i] > media){
                acima++;
            }
        }
        return acima;
    }

    public String melhorAluno(){
        int posicaoMaior = 0;//ao invés de adivinhar qual a maior nota, ele vai verificar a partir do posição 0 do vetor
        for(int i = 1; i < this.notasFinais.length; i++){//está começando do 1 pois a posição 0 já foi verificada
            if(this.notasFinais[i] > this.notasFinais[posicaoMaior]){
                posicaoMaior = i;
            }
        }
        return this.nomes[posicaoMaior];
    }

    public void aplicarBonus(double ponto){//ela está como parâmetro pois é de um valor que vai estar vindo de fora e que não vai ser fixo
        for(int i = 0; i < this.notasFinais.length; i++){
            this.notasFinais[i] += ponto;//aqui vai estar pegando as notas e somando com o ponto que o professor irá dar
            if(this.notasFinais[i] > 10){//aqui é pro caso de se acabar passando de 10 com esse ponto extra, se passar o valor máximo será 10
                this.notasFinais[i] = 10;
            }
        }
    }

    public static void main(String[] args){
        String[] nomes = {"Ana", "Bruno", "Carla", "Davi", "Elisa"};
        double[] notasFinais = {7.0, 5.5, 9.5, 6.0, 8.5};
        Turma t = new Turma("POO", nomes, notasFinais);

        System.out.println("Disciplina: " + t.getNomeDisciplina());
        t.exibir();
        System.out.println("Media da turma: " + t.calcularMedia());
        System.out.println("Acima da media: " + t.contarAcimaDaMedia());
        System.out.println("Melhor aluno: " + t.melhorAluno());

        System.out.println();
        System.out.println("Aplicando 1.0 ponto de bonus...");
        t.aplicarBonus(1.0);
        t.exibir();
        System.out.println("Media da turma: " + t.calcularMedia());
    }
}
