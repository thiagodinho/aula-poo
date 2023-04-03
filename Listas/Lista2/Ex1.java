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

/*1)	Faça um programa que leia 2 números e imprima uma mensagem dizendo se são iguais ou diferentes.*/
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();
        
        if (num1 == num2)
        {
            System.out.println("Os numeros são iguais!");
        }
        
        else
        {
            System.out.println("Os numeros são diferentes");
        }

        sc.close();
    }
    
}
