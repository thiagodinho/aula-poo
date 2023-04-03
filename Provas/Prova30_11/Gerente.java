package Prova30_11;

public class Gerente extends Funcionario {

    private int senha;

    public String cadastrarSenha(String senha){

        if(senha.length() > 5){

            return "Senha cadastrada com sucesso!";
        }

        else{

            return "Senha deve conter no mínimo 5 caracteres.";
        }

    }

    public boolean autentica(String senha){

        boolean x = senha.equals(this.senha);

        if(senha.equals(x)){

            return true;
        }
        else
        return false;
    }

    @Override
    public void setBonificacao(){

        super.setBonificacao();
        super.setBonificacao();

    }
    
}
