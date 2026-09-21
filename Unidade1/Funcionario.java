package Unidade1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void calcularBonus(double salario){
        if(salario < 1000){
            setSalario(getSalario() + (getSalario() * 0.1));
        }else if(salario >= 1000 && salario <= 3000){
            setSalario(getSalario() + (getSalario() * 0.05));
        }else{
            setSalario(getSalario() + (getSalario() * 0.02));
        }
    }

    public static void main(String[] args){
        Funcionario Salario = new Funcionario("joao", 950);
        Salario.calcularBonus(950);
        System.out.println("nome: " +Salario.getNome() +"\nsalário: " +Salario.getSalario());
    }
}
