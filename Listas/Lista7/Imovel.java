package Lista7;

public class Imovel {

    private int codigo;
    private String endereço;
    private double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Imovel() {
    }

    public Imovel(int codigo, String endereço, double valor) {
        this.codigo = codigo;
        this.endereço = endereço;
        this.valor = valor;
    }
    
}
