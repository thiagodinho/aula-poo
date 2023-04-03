package Lista5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args)
    { 
        Apolice a1 = new Apolice();
        Scanner cs = new Scanner (System.in);
        int entrada = 0;
        
        while (entrada != 3)
        {

            System.out.println("\nMenu:\n1 - Criar apolice\n2 - Ver dados apolice\n3 - Sair");
            entrada = cs.nextInt();
            switch (entrada)
            {
            case 1:
            {
                System.out.println("Digite o numero: ");
                a1.setNumero(cs.nextInt());
                System.out.println("Digite o nome: ");
                a1.setNome(cs.next());
                System.out.println("Digite a idade: ");
                a1.setIdade(cs.nextInt());
                System.out.println("Digite o sexo (M ou F): ");
                a1.setSexo(cs.next().charAt(0));
                System.out.println("Digite o valor do automovel: ");
                a1.setValorAutomovel(cs.nextInt());
                
                System.out.println("\nApolice criada!\n");
                break;

            }

            case 2:
                            
                System.out.println(a1.Imprimir());
                
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
