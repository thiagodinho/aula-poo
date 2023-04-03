package Lista7;

public class FuncionarioMensalista extends Funcionario{

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario) {
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
    }

    public String imprimir(){
        return "Numero do cracha: " + super.getNumeroCracha() + "\nNome: " + super.getNome() + "\nSetor: " + super.getSetor() + 
        "\nFunção: " + super.getFuncao() + "\nSalario: " + salario;
    }
    
}