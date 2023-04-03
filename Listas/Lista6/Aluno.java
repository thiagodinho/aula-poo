package Lista6;

public class Aluno {
    
    private String RA, nome;

    public Aluno()
    {
    
    }

    public Aluno(String RA, String nome) {
        this.RA = RA;
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String Imprimir()
    {
        return "Nome: " +nome + "RA: " +RA;
    }

}
