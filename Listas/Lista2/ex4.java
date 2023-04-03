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

//4)Entrar com 5 números e mostrar na saída qual é o menor e qual e o maior número.
public class ex4 {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int vetor[] = new int[5];
            int i;
            int max = 0;
            int min = 999;
            
            System.out.println("Digite os 5 valores do vetor: ");
            for (i=0; i<5; i++) 
            {   
                vetor[i] = sc.nextInt();
            }
            
            for (i=0;i<5;i++)
            {
                if(vetor[i] < min)
                {
                    min = vetor[i];
                }
            
                if(vetor[i] > max)
                {
                    max = vetor[i];
                }
            }
            
            System.out.printf("\n");
            
            for (i=0;i<5;i++)
            {   
                if(vetor[i] == min)
                {
                    System.out.println("Menor: " + vetor[i]);
                }
                
                if(vetor[i] == max)
                {
                    System.out.println("Maior: " + vetor[i]);
                }
            }
         sc.close();
        }     
    }
}


