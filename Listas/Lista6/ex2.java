package Lista6;

import java.util.Scanner;
import java.util.ArrayList;



public class ex2 {
    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int choice = 0;

        while (choice != 6){
            System.out.println("Menu: \n1 - Criar Pessoa \n2 - Criar Automovel \n3 - Transferir Automovel \n4 - Mostrar Todas as Pessoas    \n5 - Mostrar automóvel da pessoa \n6 - Sair");
            choice = tec.nextInt();
            if (choice == 1){
                opcao1();
            }
    
            if (choice == 2){
                opcao2();
            }
    
            if (choice == 3){
                opcao3();
            }
    
            if (choice == 4){   
                opcao4();
            }
    
            if (choice == 5){
                opcao5();
            }
            if (choice == 6){
                System.out.println("Programa encerrado.");
            }
    

        }
        tec.close();
    }

    
    public static void opcao1(){
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o codigo da pessoa");
        p1.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome da pessoa");
        p1.setNome(sc.nextLine());
    }
    public static void opcao2(){
        Scanner sc = new Scanner(System.in);
        Automovel a1 = new Automovel();
        System.out.println("Digite a marca do automovel");
        a1.setMarca(sc.nextLine());
        System.out.println("Digite o modelo do automovel");
        a1.setModelo(sc.nextLine());
        System.out.println("Digite o codigo do dono do automovel");
        int CodEscolhido = Integer.parseInt(sc.nextLine());
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == CodEscolhido){
                pessoa.inserirAutomovel(a1);
            }
        }
    }
    public static void opcao3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do dono");
        int cod = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o codigo do comprador");
        int codComprador = Integer.parseInt(sc.nextLine());
        
        Pessoa pv = new Pessoa();
        for (Pessoa pessoa : pessoas) {
            if (cod == pessoa.getCodigo()){
                pv = pessoa;
            }
        }
        Pessoa pcompra = new Pessoa();
        for (Pessoa pessoa : pessoas) {
            if (cod == pessoa.getCodigo()){
                pcompra = pessoa;
            }
        }
        
        System.out.println("Escolha o modelo a ver vendido");
        for (Automovel auto : pv.getAutomoveis()) {
            System.out.println(auto.imprimir());
        }
        String modeloEscolhido = sc.nextLine();
        Automovel autoEscolhido = new Automovel();
        for (Automovel auto : pv.getAutomoveis()) {
            if(modeloEscolhido == auto.getModelo()){
                autoEscolhido = auto;
            }
        }

        int index = pv.getAutomoveis().indexOf(autoEscolhido);
        pv.removerAutomovel(index);

        pcompra.inserirAutomovel(autoEscolhido);

    }
    
    public static void opcao4(){

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.imprimir());
        }
    }

    public static void opcao5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo da pessoa");
        int codPessoa = Integer.parseInt(sc.nextLine());
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codPessoa){
                pessoa.imprimirCompleto();
            }
        }
    }
}
