package Lista5;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    public static int QntVendedores;
    
    
    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public Vendedor() {
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double CalcularPagamentoComissao(double valorVenda){

        return valorVenda * percentualComissao /100;
    }

    public double CalcularPagamentoComissao(double valorVenda, double desconto){

        return CalcularPagamentoComissao(valorVenda) - desconto;
    }

    public String Imprimir(double ValorVenda, double desconto)
    {
        return "\nCodigo: " +codigo + "\nNome: " +nome + "\nValor venda: " +ValorVenda + "\nPorcentagem de comissao: " +percentualComissao + "\nDesconto: " +desconto + "\nValor a pagar: " +CalcularPagamentoComissao(ValorVenda, desconto);
    }
}
