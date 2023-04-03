/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

import java.util.Scanner;

/*2) Entrar com dois números e imprimi-los em ordem crescente (suponha números diferentes).*/
/**
 *
 * @author Thiago
 */
public class Ex2 {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();
        
        if (num1 > num2)
        {
            System.out.println("Ordem crescente: " + num2 + "," + num1);
            
        }
        
        else
        {
            System.out.println("Ordem crescente: " + num1 + "," + num2);
            
        }

        sc.close();
    }
    
}
