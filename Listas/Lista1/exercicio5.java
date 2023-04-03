package Lista1;

import java.util.Scanner;

/*Ler uma temperatura em graus Centígrados e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F = (9*C+160)/5. 
Onde F é a temperatura em Fahrenheit e C é a temperatura em Centígrados. */

public class exercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int F, C;

        System.out.println("Digite a temperature em Celsius: ");
        C = teclado.nextInt();

        F = ((9*C+160)/5);

        System.out.println("Conversão para Fahrenheit: " + F);
        
        teclado.close();
    }
    
}
