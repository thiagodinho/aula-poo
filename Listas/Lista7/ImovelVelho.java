package Lista7;

public class ImovelVelho extends Imovel {

    private double valorDesconto;

    

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    } 

    public double calcularValorImovel(){
        return super.getValor() - valorDesconto;
    } 
    
    public ImovelVelho() {
    }

    public ImovelVelho(int codigo, String endereço, double valor, double valorDesconto) {
        super(codigo, endereço, valor);
        this.valorDesconto = valorDesconto;
    }

    public String imprimir(){
        return "Codigo: " + super.getCodigo() + "\nEndereço: " + super.getEndereço() +  "\nNovo valor do imovel: " 
        + calcularValorImovel();
    }
}
