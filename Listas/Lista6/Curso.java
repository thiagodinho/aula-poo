package Lista6;
import java.util.ArrayList;

public class Curso {
    
    private int codigo, cargaHoraria;
    private String nome;
    private ArrayList <Aluno> alunos = new ArrayList<>();


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Curso()
    {

    }

    public Curso(int codigo, int cargaHoraria, String nome) {
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
    } 

    public void inserirAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }

    public void removerAluno(int index)
    {
        alunos.remove(index);
    }
    
    public String imprimir()
    {
        return "\nCodigo: " +codigo + "Nome: " +nome + "\nCarga horaria: " + cargaHoraria; 
    }

    public String imprimirCompleto()
    {
        String retorno = imprimir();
        retorno += "\n";
        for (Aluno aluno : alunos) {
            retorno += aluno.Imprimir();
        }

        return retorno;
    }

}
