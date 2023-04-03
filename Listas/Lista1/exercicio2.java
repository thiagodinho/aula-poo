package Lista1;
/*Ler os valores de comprimento, largura e altura e apresentar o valor do volume de uma caixa retangular. Utilize para o cálculo a formula 
Volume = comprimento * largura * altura*/

import java.util.Scanner;

public class exercicio2 
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float comprimento, altura, largura, volume;
        
        System.out.println("Digite o comprimento em cm: ");
        comprimento = teclado.nextFloat();    
        System.out.println("Digite a altura em cm: ");
        altura = teclado.nextFloat();
        System.out.println("Digite a largura em cm: ");
        largura = teclado.nextFloat();

        volume = comprimento * altura * largura;
        System.out.println("O volume e " + volume + "cm");
        teclado.close();
    }
}
