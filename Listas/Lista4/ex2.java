package Lista4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Scanner cs = new Scanner (System.in);
        int entrada = 0;
        
        
        while (entrada != 3)
        {
            System.out.println("Menu:\n1 - Criar alunos\n2 - Mostrar aluno\n3 - Sair");
            entrada = cs.nextInt();

            switch (entrada)
            {
            case 1:
            {
                System.out.println("Digite o nome: ");
                aluno1.setNome(cs.next());
                System.out.println("Digite o RA: ");
                aluno1.setRA(cs.next());
                System.out.println("Digite a AC1: ");
                aluno1.setAC1(cs.nextFloat());
                System.out.println("Digite a AC2: ");
                aluno1.setAC2(cs.nextFloat());
                System.out.println("Digite a AG: ");
                aluno1.setAG(cs.nextFloat());
                System.out.println("Digite a AF: ");
                aluno1.setAF(cs.nextFloat());
                
                break;
            }

            case 2:
            {
                System.out.println(aluno1.Imprimir());
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

