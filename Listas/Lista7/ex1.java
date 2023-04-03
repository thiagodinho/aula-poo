package Lista7;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FuncionarioMensalista f1 = new FuncionarioMensalista();
        FuncionarioHorista f2 = new FuncionarioHorista();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao = 0;
        int option = 0;

        while (opcao != 3){
            System.out.println("Menu: \n1- Inserir Funcionario \n2- Exibir Funcionario \n3- Sair ");
            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("1- Funcionário Horista \n2- Funcionário Mensalista");
                option = sc.nextInt();

                if(option == 1){

                    System.out.println("Digite o nome: ");
                    f2.setNome(sc.next());
                    System.out.println("Digite o numero do cracha: ");
                    f2.setNumeroCracha(sc.nextInt());
                    System.out.println("Digite o setor: ");
                    f2.setSetor(sc.next());
                    System.out.println("Digite a função: ");
                    f2.setFuncao(sc.next());
                    System.out.println("Digite a quantidade de horas trabalhadas: ");
                    f2.setQtdeHoras(Integer.parseInt(sc.next()));                 
                    System.out.println("Digite o valor cobrado por hora trabalhada: ");
                    f2.setValorHora(sc.nextDouble());

                    funcionarios.add(f2);

                }
                if(option == 2){

                    System.out.println("Digite o nome: ");
                    f1.setNome(sc.next());
                    System.out.println("Digite o numero do cracha: ");
                    f1.setNumeroCracha(Integer.parseInt(sc.next()));
                    System.out.println("Digite o setor: ");
                    f1.setSetor(sc.next());
                    System.out.println("Digite a função: ");
                    f1.setFuncao(sc.next());
                    System.out.println("Digite o salário: ");
                    f1.setSalario(sc.nextDouble());

                    funcionarios.add(f1);

                }
            }
            if (opcao == 2 ){

                System.out.println("1- Funcionarios Horistas \n2- Funcionarios Mensalistas ");
                option = sc.nextInt();

                if(option == 1){

                    System.out.println(f2.imprimir());

                }
                if(option == 2){

                    System.out.println(f1.imprimir());

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