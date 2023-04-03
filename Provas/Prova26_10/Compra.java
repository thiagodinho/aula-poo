package Prova26_10;

import java.util.ArrayList;

public class Compra {

    private String data;
    private ArrayList <Item> itens = new ArrayList<>();

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public double obterValorTotal(){
        double total = 0;
        for (Item item : itens) {
         total += item.getQuantidade() * item.getProduto().getPreco();
        }

        return total;
    }

    public void adicionarItem(int quantidade, Produto produto){
        itens.add(new Item(quantidade, produto));
    }
}

