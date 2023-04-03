package Aula31_08;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        //p1.nome = "Thiago";
        p1.setNome("Thiago");
       // p1.telefone = "15996239087";
       p1.setTelefone("15999999999");
        p1.idade = 20; 

        Pessoa p2 = new Pessoa();
        //p2.nome = "Daniel";
        p2.setNome("Dan");
        p1.perguntaONome(p2);
        p2.respondeNome();
        
        
    }
}
