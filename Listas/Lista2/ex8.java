/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */

/*8)Ler um número entre 1 e 12, e escrever o mês correspondente.   Caso o usuário digite um número fora deste intervalo, 
deverá aparecer uma mensagem, informando que não existe mês com este número. */
public class ex8 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    int num;
    
        System.out.println("Digite um número de 1 a 12 para saber o mês correspondente: ");
        num = sc.nextInt();
        
        switch (num)
        {
            case 1: 
                System.out.println("1 - Janeiro");
                break;
            
            case 2: 
                System.out.println("2 - Feveireiro");
                break;
            
            case 3: 
                System.out.println("3 - Março");
                break;
            
            case 4: 
                System.out.println("4 - Abril");
                break;
        
            case 5: 
                System.out.println("5 - Maio");
                break;
            
            case 6: 
                System.out.println("6 - Junho");
                break;
                
            case 7: 
                System.out.println("7 - Julho");
                break;
                
            case 8: 
                System.out.println("8 - Agosto");
                break;
                
            case 9: 
                System.out.println("9 - Setembro");
                break;
                
            case 10: 
                System.out.println("10 - Outubro");
                break;
                
            case 11: 
                System.out.println("11 - Novembro");
                break;
                
            case 12: 
                System.out.println("12 - Dezembro");
                break;
                
            default:
                System.out.println("Não existe um mês correspondente a esse número.");
        }
        
        sc.close();
    }
}
