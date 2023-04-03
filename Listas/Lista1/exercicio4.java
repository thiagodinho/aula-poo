package Lista1;

import java.util.Scanner; 
/*Receba a altura e a largura e a partir dessa informação calcule a área o e perímetro de um retângulo, onde:
área = base * altura
perímetro = 2base + 2altura
 */
public class exercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float alt, larg, area, per;

        System.out.println("Digite a altura do retangulo: ");
        alt = teclado.nextFloat();
        System.out.println("Digite a largura do retangulo: ");
        larg = teclado.nextFloat();

        area = larg * alt;
        per = (2*larg) + (2*alt);

    System.out.println("Area: " + area + "\nPerimetro: " + per);

        teclado.close();
    }
    
}
