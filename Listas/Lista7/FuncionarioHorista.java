package Lista7;

public class FuncionarioHorista extends Funcionario{

    private int qtdeHoras;
    private double valorHora;

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdeHoras,
            double valorHora) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public String imprimir(){
        return "Número do cracha: " + super.getNumeroCracha() + "\nNome: " + super.getNome() + "\nSetor: " + super.getSetor() + 
        "\nFunção: " + super.getFuncao() + "\nQuantidade de Horas: " + qtdeHoras + "\nValor da Hora: " + valorHora;
    }
}
