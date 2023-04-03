package Lista7;

public class ImovelNovo extends Imovel{

    private double valorAdicional;

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public double calcularValorImovel(){
        return super.getValor() + valorAdicional;
    }  
    
    public ImovelNovo() {
    }

    public ImovelNovo(int codigo, String endereço, double valor, double valorAdicional) {
        super(codigo, endereço, valor);
        this.valorAdicional = valorAdicional;
    }

    public String imprimir(){
        return "Codigo: " + super.getCodigo() + "\nEndereço: " + super.getEndereço() +  "\nNovo valor do imovel: " + 
        calcularValorImovel();
    }
}
