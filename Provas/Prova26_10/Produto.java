package Prova26_10;

public class Produto {

    private String nome;
    private double preco;

    public Produto(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String imprimir(){

        return "Produto: " +nome + "Preço: R$" +preco;
    }

    
}
