package Lista4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Scanner cs = new Scanner (System.in);
        int entrada = 0;
        
        
        while (entrada != 4)
        {
            System.out.println("Menu:\n1 - Criar funcionário\n2 - Mostrar Folha de Pagamento\n3 - Alterar Remuneração\n4 - Sair");
            entrada = cs.nextInt();

            switch (entrada)
            {
            case 1:
            {
                System.out.println("Digite o nome: ");
                func1.setNome(cs.next());
                System.out.println("Digite o crachá: ");
                func1.setCracha(cs.nextInt());
                System.out.println("Digite o tipo do vínculo: ");
                func1.setTipoVinculo(cs.next().charAt(0));

                if(func1.TipoVinculo == 'h')
                {
                    System.out.println("Digite a quantidade de horas: ");
                    func1.setQntdHora(cs.nextFloat());
                    System.out.println("Digite o valor da hora: ");
                    func1.setValorHora(cs.nextFloat());
                }

                else
                {
                    System.out.println("Digite o salário: ");
                    func1.setSalario(cs.nextFloat());
                }

                System.out.println("Digite o desconto: ");
                func1.setValorDesconto(cs.nextFloat());
                
                
                break;
            }

            case 2:
            {
                System.out.println(func1.Imprimir());
                break;
            }

            case 3:
            {
                if(func1.TipoVinculo == 'h')
                {
                    System.out.println("Digite a quantidade de horas: ");
                    func1.setQntdHora(cs.nextFloat());
                    System.out.println("Digite o valor da hora: ");
                    func1.setValorHora(cs.nextFloat());

                }

                else
                {
                    System.out.println("Digite o salário: ");
                    func1.setSalario(cs.nextFloat());
                }

                System.out.println("Digite o desconto: ");
                func1.setValorDesconto(cs.nextFloat());

                System.out.println(func1.Imprimir());

                break;
            }

            case 4:
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
