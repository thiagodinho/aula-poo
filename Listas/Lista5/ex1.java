package Lista5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args)
    { 
        Calculadora c1 = new Calculadora();
        Scanner cs = new Scanner (System.in);
        int entrada = 0, num1, num2;
        
        while (entrada != 5)
        {
            System.out.println("\nDigite o primeiro valor: ");
            num1 = cs.nextInt();
            System.out.println("Digite o segundo valor: ");
            num2 = cs.nextInt();

            System.out.println("\nMenu:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair");
            entrada = cs.nextInt();
            switch (entrada)
            {
            case 1:
            {
                System.out.println("\n" +num1 + " + " + num2 + " = " + c1.soma(num1, num2));
                
                break;
            
            }

            case 2:
                            
                System.out.println("\n" +num1 + " - " + num2 + " = " + c1.subtracao(num1, num2));
                
                break;
            

            case 3:
            {
                System.out.println("\n" +num1 + " x " + num2 + " = " + c1.multiplicacao(num1, num2));
                
                break;
            }

            case 4:
            {
                System.out.println("\n" +num1 + " : " + num2 + " = " + c1.divisao(num1, num2));
                
                break;
            }

            case 5:
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
