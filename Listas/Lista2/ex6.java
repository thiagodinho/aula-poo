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

/*6)	Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. 
Não se esqueça de verificar se o ano de nascimento é um ano válido.*/
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ano_nasc, ano_atual, idade;
        
        System.out.println("Digite em que ano estamos: ");
        ano_atual = sc.nextInt();
        System.out.println("Digite o ano de se nascimento: ");
        ano_nasc = sc.nextInt();
        
        idade = ano_atual - ano_nasc;
        
        if (ano_nasc > ano_atual)
        {
            System.out.println("Inválido. O ano atual deve ser maior ou igual ao ano de nascimento.");
        }
        
        else
        {                     
            System.out.println("Idade atual: " + idade + " anos.");
        }
        
        sc.close();
    }
}
