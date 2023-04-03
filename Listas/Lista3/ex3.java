package Lista3;

import java.util.Scanner;

//Entrar com 20 números e imprimir a soma dos positivos e o total de números negativos.
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[20];
        int soma = 0, j = 0;
        
        System.out.println("Digite 20 numeros: ");
        for(int i=0;i<20;i++)
        {
            v[i] = sc.nextInt();
            
            if(v[i] > 0)
            {
                soma = soma + v[i];
            }

            else
            {
                j++;
            }
           
        }

        System.out.println("Soma dos positivos: " +soma);
        System.out.println("Quantidade de numero negativos: " +j);
        sc.close();
    }
}
