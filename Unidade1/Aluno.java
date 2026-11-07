package Unidade1;

public class Aluno {
    private double nota1;
    private double nota2;
    private double frequencia;

    public Aluno(double nota1, double nota2, double frequencia){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.frequencia = frequencia;
        System.out.println("primeira nota: " +nota1);
        System.out.println("segunda nota: " +nota2);
        System.out.println("porcentagem de frequência: " +frequencia);
        System.out.print("sitação: ");
    }

    public double getNota1(){ //esse vai ler a informação
        return nota1;
    }
    public void setNota1(double nota1){// redefinir a informação existente
        this.nota1 = nota1;
    }

    public double getNota2(){
        return nota2;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double getFrequencia(){
        return frequencia;
    }
    public void setFrequencia(double frequencia){
        this.frequencia = frequencia;
    }


    public void situacao(){
        double media = ((getNota1() + getNota2()) / 2);

        boolean MediaAtingida = (media >= 6.0);
        boolean FreqAtingida = (frequencia >= 75);

        if(MediaAtingida && FreqAtingida){
            System.out.println("aprovado");
        }else if(!MediaAtingida && FreqAtingida){
            System.out.println("reprovado por média");
        }else if(MediaAtingida && !FreqAtingida){
            System.out.println("reprovado por falta");
        }else{
            System.out.println("reprovado por média e por falta");
        }

    }

    public static void main(String[] args){
        Aluno aluno = new Aluno(6.0, 8.0, 80);
        aluno.situacao();
    }
}
