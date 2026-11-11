package Unidade2;

public class Horario {
    private int horas;
    private int minutos;

    public Horario(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
    }

    public Horario(int horas) {//esse vai servir somente pra instanciar as horas
        this(horas, 0);
    }

    public int getHoras(){
        return this.horas;
    }

    public int getMinutos(){
        return this.minutos;
    }

    public void adicionar(int minutos){//esse método vai avançar o horário em tantos minutos
        int total = this.horas * 60 + this.minutos + minutos;//aqui vai multiplicar as horas atuais com 60, depois os minutos atuais com os minutos que serão informados
        this.horas = (total / 60) % 24;//%24 faz o relógio zerar e não passar de 23
        this.minutos = total % 60;//aqui mostra o tanto de minutos que não completaram uma hora
    }

    public void adicionar(int horas, int minutos){//aqui esse método vai converter tudo em minutos e depois passa o trabalho pro outro método adicionar()
        adicionar(horas * 60 + minutos);
    }

    @Override//ele avisa que o que irá retornar está personalisado e não a forma padrão da superclasse Object
    public String toString(){
        return String.format("%02d:%02d", this.horas, this.minutos);
        //a função String.format() cria uma String formatada parecido com C
    }

    public static void main(String[] args) {
        Horario aula = new Horario(7, 30);
        System.out.println("Inicio: " + aula);

        aula.adicionar(50);
        System.out.println("+ 50 min: " + aula);

        aula.adicionar(1, 45);
        System.out.println("+ 1h45: " + aula);

        Horario noite = new Horario(23, 50);
        noite.adicionar(20);
        System.out.println("23:50 + 20 min: " + noite);
    }
}
