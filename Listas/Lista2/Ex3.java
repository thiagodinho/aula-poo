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

/*3) Entrar com um número e informar se ele é divisível por 10, ou é divisível por 5, 
ou é divisível por 2 ou se não é divisível por nenhum destes.*/
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        
        if (num % 10 == 0)
        {
            System.out.println("O mumero é divisível por 10.");
        }
        
        if (num % 5 == 0)
        {
            System.out.println("O mumero é divisível por 5.");
        }
        
        if (num % 2 == 0)
        {
            System.out.println("O mumero é divisível por 2.");
        }
        
        if ( num % 10 != 0 && num % 5 != 0 && num % 2 != 0)
        {
            System.out.println("O número não é divisível por 10, 5 ou 2.");
        }
        
        sc.close();
}
}
