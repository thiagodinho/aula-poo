package Lista4;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args)
    { 
        Pessoa person1 = new Pessoa();
        Scanner cs = new Scanner (System.in);
        int entrada = 0;
        
        while (entrada != 3)
        {
            System.out.println("Menu:\n1 - Criar pessoa\n2 - Mostrar pessoas\n3 - Sair");
            entrada = cs.nextInt();
            switch (entrada)
            {
            case 1:
            {
                System.out.println("Digite o nome: ");
                person1.setNome(cs.next());
                System.out.println("Digite o CPF: ");
                person1.setCPF(cs.next());
                System.out.println("Digite a idade: ");
                person1.setIdade(cs.nextInt());
                System.out.println("Digite o sexo (F pra feminino e M pra masculino): ");
                person1.setSexo(cs.next().charAt(0));
                
                break;
            
            }

            case 2:
            {
                System.out.println(person1.imprimir());
                
                break;
            }

            case 3:
            {
                System.out.println("Obrigado!");
                break;
            }

            default: 
            {
                System.out.println("Opção inválida.");
            }
        }

        }
        cs.close();
    }
}


