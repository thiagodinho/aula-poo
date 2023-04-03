package Lista7;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ImovelNovo> novo = new ArrayList<>();
        ArrayList<ImovelVelho> velho = new ArrayList<>();

        int opcao = 0;
        int option = 0;

        while (opcao != 3){

            System.out.println("Menu: \n1 - Inserir Imóvel \n2 - Exibir Imóveis \n3 - Sair ");
            opcao = sc.nextInt();

            if (opcao == 1 ){

                System.out.println("1- Imóvel Novo \n2- Imóvel Velho ");
                option = sc.nextInt();

                if(option == 1){

                    ImovelNovo i1 = new ImovelNovo();
                    System.out.println("Digite o código: ");
                    i1.setCodigo(sc.nextInt());
                    System.out.println("Digite o endereço: ");
                    i1.setEndereço(sc.next());
                    System.out.println("Digite o valor a ser adicionado: ");
                    i1.setValorAdicional(sc.nextDouble());

                    novo.add(i1);

                }
                if(option == 2){

                    ImovelVelho i2 = new ImovelVelho();
                    System.out.println("Digite o codigo: ");
                    i2.setCodigo(sc.nextInt());
                    System.out.println("Digite o endereço: ");
                    i2.setEndereço(sc.next());
                    System.out.println("Digite o valor a ser descontado: ");
                    i2.setValorDesconto(sc.nextDouble());

                    velho.add(i2);

                }
            }
            if (opcao == 2 ){

                
                System.out.println("--------------------Imovel Novo--------------------");
                for (ImovelNovo imovelnovo : novo) {

                    System.out.println(imovelnovo.imprimir());
                }

                System.out.println("--------------------Imovel Velho--------------------");
                for (ImovelVelho imovelvelho : velho) {

                    System.out.println(imovelvelho.imprimir());

                }
                
            }

            if (opcao == 3 ){

                System.out.println("Programa encerrado.");
            }

            else{
                
                System.out.println("Opção inválida");
            }
        }

        sc.close();
    }
}
