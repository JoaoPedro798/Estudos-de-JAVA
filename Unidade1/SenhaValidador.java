package Unidade1;

public class SenhaValidador {
    private String senha;

    public SenhaValidador(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    }

    public boolean isSenhaForte(){
        if(getSenha().length() < 8){
            return false;
        }
        boolean TemNumero = false;
        boolean TemMaiuscula = false;
        //essas duas linhas dizem que a senha não tem nenhum número e letra maiúscula

        for(int i = 0; i < getSenha().length(); i++){
            char c = getSenha().charAt(i);//aqui ele vai fazer cortes na string enquanto o for roda pra fazer as verificações
            if(Character.isDigit(c)){
                TemNumero =  true;
            }if(Character.isUpperCase(c)){
                TemMaiuscula = true;
            }
        }
        return TemNumero && TemMaiuscula;
    }

    public static void main(String[] args){
        SenhaValidador senha = new SenhaValidador("Setembro");
        System.out.println("sua senha é forte? " +senha.isSenhaForte());
    }
}
