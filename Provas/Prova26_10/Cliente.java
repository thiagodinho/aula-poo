package Prova26_10;
import java.util.ArrayList;
public class Cliente {
    private String nome;
    private String telefone;
    public ArrayList <Compra> compras = new ArrayList<>();

    public ArrayList<Compra> getCompras() {
        return compras;
    }
    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }    
    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    public double totaldeGastos(){
        double total = 0;
        for (Compra compra : compras) {
            total += compra.obterValorTotal();
        }
        return total;
        }
    public String imprimir()
    {
        String texto = "";
        for (Compra compra : compras) {
            for (Item itensItem : compra.getItens()) {
                texto += "\nCliente: " +nome + "\nTelefone: " +telefone + "\nCompras: \n" + "--Data: " +compra.getData() + "\n----Produto: " + itensItem.getQuantidade() + "X " 
                +itensItem.getProduto() + "\n----Preço: " +itensItem.getProduto().getPreco() + "\n----Produto: " + itensItem.getQuantidade() + "X " +itensItem.getProduto() 
                + "\n----Preço: " +itensItem.getProduto().getPreco() + "\nTotal da Compra: " +compra.obterValorTotal();               
            }
        }
        return texto;
    }    
}
