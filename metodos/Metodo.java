public class metodo {
    //método: bloco de código criado para fazer uma tarefa específica
    //é como se fosse uma função em c

    //funcão nomeada de func
    static void func(){
        System.out.println("olá mundo");
        System.out.println("programar");
        System.out.println("em");
        System.out.println("java");
    }

    static void pessoa(String n, int m){
        System.out.println("seu nome é: " +n);
        System.out.println("sua idade é: " +m);
    }

    public static void main(String[] args){
        func();//chamada da função

        System.out.println("");

        pessoa("joão", 20);
    }
    
}
