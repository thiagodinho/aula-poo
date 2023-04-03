package Lista3;

import java.util.Scanner;

//1 - Ler três números e mostra-los em ordem do menor para o maior. O sistema pode aceitar números iguais
public class ex1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int a, b, c;
        int menor, meio, maior;

        System.out.println("Digite o 1o numero: ");
        a = sc.nextInt();
        System.out.println("Digite o 2o numero: ");
        b = sc.nextInt();
        System.out.println("Digite o 3o numero: ");
        c = sc.nextInt();

        if (a > b && a > c)
        {
            maior = a;

            if (b > c)
            {
                meio = b;
                menor = c;

                System.out.println("Ordem crescente: " +menor +meio +maior);
            }

            if (c > b)
            {
                meio = c;
                menor = b;

                System.out.println("Ordem crescente: " +menor +meio +maior);
            }

            
        }

        if (b > a && b > c)
        {
            maior = b;

            if (a > c)
            {
                meio = a;
                menor = c;

                System.out.println("Ordem crescente: " +menor +meio +maior);
            }

            if (c > a)
            {
                meio = c;
                menor = a;

                System.out.println("Ordem crescente: " +menor +meio +maior);
            }
        }

        if (c > a && c > b)
        {
            maior = c;

            if (a > b)
            {
                meio = a;
                menor = b;

                System.out.println("Ordem crescente: " +menor +meio +maior);
            }

            if (b > a)
            {
                meio = b;
                menor = a;

                System.out.println("Ordem crescente: " +menor +meio +maior);
            }
        }

        sc.close();
    }
}
