package Lista4;

public class Funcionario {
    private int cracha;
    private String nome;
    public char TipoVinculo;
    private float ValorHora, QntdHora, Salario, ValorDesconto;

    public int getCracha() {
        return cracha;
    }
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getTipoVinculo() {
        return TipoVinculo;
    }
    public void setTipoVinculo(char tipoVinculo) {
        TipoVinculo = tipoVinculo;
    }
    public float getValorHora() {
        return ValorHora;
    }
    public void setValorHora(float valorHora) {
        ValorHora = valorHora;
    }
    public float getQntdHora() {
        return QntdHora;
    }
    public void setQntdHora(float qntdHora) {
        QntdHora = qntdHora;
    }
    public float getSalario() {
        return Salario;
    }
    public void setSalario(float salario) {
        Salario = salario;
    }
    public float getValorDesconto() {
        return ValorDesconto;
    }
    public void setValorDesconto(float valorDesconto) {
        ValorDesconto = valorDesconto;
    }
    
    public float CalcularValorSalario()
    {
        if (TipoVinculo == 'h')
        {
            return ValorHora * QntdHora - ValorDesconto;
        }

        else
        {
            return Salario - ValorDesconto;
        }

    }

    public String Imprimir()
        {
            if(TipoVinculo == 'h')
            {
                return "Cracha: " + cracha + "\nNome: " + nome + "\nTipo de vinculo: " + TipoVinculo + "\nQuantiade de horas: " + QntdHora + "\nValor da hora: " + ValorHora + "\nDesconto: " + ValorDesconto + "\nValor a receber: " +CalcularValorSalario() + "\n";
            }

            else
            return "Cracha: " + cracha + "\nNome: " + nome + "\nTipo de vinculo: " + TipoVinculo + "\nSalário: " + Salario + "\nDesconto: " + ValorDesconto + "\nValor a receber: " +CalcularValorSalario() + "\n";
        }
}


