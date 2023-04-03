package Aula21_09;

import java.util.ArrayList;
import java.util.List;

public class AulaLista {

    public static void main(String[] args) {
        
    
    //Array
    int[] numeros = new int [3];
    numeros[0] = 10;
    numeros[1] = 5;
    numeros[2] = 7;
    System.out.println(numeros[1]);
    numeros[0] = 11;
    
    for(int i=0;i<numeros.length;i++)
    {
        System.out.println("For -> " +numeros[i]);
    }

    //foreach
    for (int j : numeros) {
        System.out.println("For each -> " +j);
    }

    int numeroChefe = 6;
    int[] numeros2 = new int[4];

    for(int i=0;i<3;i++)
    {
        numeros2[i] = numeros[i];
        
    }

    numeros2[3] = numeroChefe;

     //Lista
     List<String> nomes = new ArrayList<>();
     
     //adiciona objetos na lista
     nomes.add("Edson");
     nomes.add("Thiago");
     nomes.add("Igor");
     nomes.add("Daniel");
     nomes.add("Giulia");
     System.out.println(nomes);
     
     //adiciona na posiçao definida
     nomes.add(2, "Brian");
     System.out.println(nomes);
     
     //verfica se tem o objeto
     if (nomes.contains("Brian"))
     {
        System.out.println("TEM BRAIA NA LISTA");
     }
     
     //get - retorna o objeto na posição espicificada
     System.out.println("Posicao 2: " +nomes.get(1));

     //retorna o índice (posição) do objeto
     System.out.println("O Igor está na posicao " + nomes.indexOf("Igor"));

     //set - troca de objeto pelo indice passado
     nomes.set(1, "Rafa");

     //
     for(int i = 0; i < nomes.size(); i++)
     {
        System.out.println("for ->" + nomes.get(i));
     }

     //limpa o conteudo da lista
     nomes.clear();
     System.out.println(nomes);
     
     Fornecedor f1 = new Fornecedor();
     f1.setNome("Bic");
     Produto p1 = new Produto("Caneta", 2, 0);
     //f1.produtos.add(p1);
     f1.setProduto(p1);
     Produto p2 = new Produto("Lapis", 5, 0);
     //f1.produtos.add(p1);
     f1.setProduto(p2);

     for(Produto produto : f1.getProdutos())
     {
        System.out.println(produto.getNome());
     }

     Fornecedor f2 = new Fornecedor();
     f2.setNome("Dell");

     Produto p3 = new Produto("notebook", 5300, 0);
     f2.setProduto(p3);
     ArrayList<Fornecedor> fornecedores = new ArrayList<>();
     fornecedores.add(f1);
     fornecedores.add(f2);

     for(Fornecedor forn : fornecedores)
     {
        System.out.println("Fornecedor: " +forn.getNome());

        for(Produto p : forn.getProdutos())
     {
        System.out.println("------Produto: "+p.getNome());
     }
    }
  }
}
