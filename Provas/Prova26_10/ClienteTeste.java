package Prova26_10;

import java.util.ArrayList;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Thiago", "15996239087");
        ArrayList<Compra> compra = new ArrayList<>();
        Compra compra1 = new Compra();
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        p1.setNome("Caneta");
        p1.setPreco(2);
        p2.setNome("Estojo");
        p2.setPreco(5);
        compra1.adicionarItem(5, p2);
        compra1.adicionarItem(1, p1);

        Compra compra2 = new Compra();
        Produto p3 = new Produto();
        Produto p4 = new Produto();
        
        p3.setNome("Pastel");
        p3.setPreco(8);
        p4.setNome("Refrigerante");
        p4.setPreco(5);
        compra2.adicionarItem(2, p3);
        compra2.adicionarItem(1, p4);
        
        compra.add(compra1);
        compra.add(compra2);

        c1.setCompras(compra);

        System.out.println(c1.imprimir());
        System.out.println(c1.totaldeGastos());

        
    }
    
}
