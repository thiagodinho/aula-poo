package Lista5;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args)
    { 
        Vendedor v1 = new Vendedor();
        Scanner cs = new Scanner (System.in);
        int entrada = 0;
        double ValorVenda, desconto;
        
        while (entrada != 3)
        {

            System.out.println("\nMenu:\n1 - Cadastrar vendedor\n2 - Calcular comissao\n3 - Sair");
            entrada = cs.nextInt();
            switch (entrada)
            {
            case 1:
            {              
                System.out.println("Digite o ID: ");   
                v1.setCodigo(cs.nextInt());     
                System.out.println("Digite o nome: ");
                v1.setNome(cs.next());
                System.out.println("Digite o percentual da comissao: ");
                v1.setPercentualComissao(cs.nextDouble());
                
                System.out.println("\nVendedor cadastrado!\n");
                Vendedor.QntVendedores++;
                break;
            }

            case 2:

                System.out.println("Digite o valor da venda: ");
                ValorVenda = cs.nextDouble();
                System.out.println("Digite o valor do desconto: ");
                desconto = cs.nextDouble();
                            
                System.out.println(v1.Imprimir(ValorVenda, desconto));
                
                break;
            

                case 3:
                {
                    System.out.println("\nObrigado!");
                    break;
                }
    
                default: 
                {
                    System.out.println("Opçao inválida.");
                }
            }

        }
        cs.close();
    }

}
