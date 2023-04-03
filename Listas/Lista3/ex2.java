package Lista3;

import java.util.Scanner;

//Entrar com 20 números e imprimir a soma desses números.
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v[] = new int[20];
        int soma = 0;
        
        System.out.println("Digite 20 numeros para descobrir a soma deles: ");
        for(int i=0;i<20;i++)
        {
            v[i] = sc.nextInt();
            soma = soma + v[i];
        }

        System.out.println("Soma: " +soma);

        sc.close();
    }
}
