package Lista3;

import java.util.Scanner;

//Faça um algoritmo que deixe escolher qual a tabuada de multiplicar que se deseja imprimir.
public class ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero para ver a tabuada: ");
        num = sc.nextInt();

        for(int i=0;i<=10;i++)
        {
            System.out.println(num + " * " + i + " = " +num*i);
        }

        sc.close();
    }
}
