/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

/**
 *
 * @author Thiago
 */
import java.util.Scanner;

      /*Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:
•	Não eleitor (abaixo de 16 anos)
•	Eleitor obrigatório (entre 18 e 65 anos) 
•	Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos) */

public class ex7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        if (idade < 16)
        {
            System.out.println("Não eleitor.");
        }
        
        if (idade > 17 && idade < 66)
        {
            System.out.println("Eleitor obrigatório");
        }
        
        if (idade > 15 && idade < 19 || idade > 65)
        {
            System.out.println("Eleitor facultativo.");
        }
        
        sc.close();
    }
    
}
