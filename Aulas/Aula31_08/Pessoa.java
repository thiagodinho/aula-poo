package Aula31_08;

public class Pessoa 
{
    private String nome;
    private String telefone;
    int idade;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    void perguntaONome(Pessoa pes)
    {
        System.out.println("Qual seu nome?");
        System.out.println("Meu nome é " +pes.nome);
        pes.respondeNome();
    }

    void respondeNome()
    {
        System.out.println("Meu nome é blabla");
    }

}
