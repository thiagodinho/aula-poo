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

/*5) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00 
caso contrário, o lucro será de 30%. Entrar com o valor do produto e imprimir o valor da venda.*/
public class ex5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        double valor_produto, valor_venda,porcentagem;
             
        System.out.println("Digite o valor do produto: ");
        valor_produto = sc.nextDouble();
        
        if (valor_produto < 20)
        {
            porcentagem = 45.0/100.0;
            valor_venda = valor_produto + (porcentagem * valor_produto);
            
            System.out.println("Valor de venda: " + valor_venda);
        }
        
        if (valor_produto >= 20)
        {
            porcentagem = 30.0/100.0;
            valor_venda = valor_produto + (porcentagem * valor_produto);
            
            System.out.println("Valor de venda: " + valor_venda);
        }
          
        sc.close();
    }
}
