package Lista1;

import java.util.Scanner;

/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12km por litro. Para obter o 
cálculo o usuário deve fornecer o tempo gasto na viagem e a velocidade média durante ela.
Dessa forma será possível obter a distância percorrida com a fórmula
DISTANCIA = TEMPO * VELOCIDADE
Tendo o valor da distância basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
LITROS_USADOS = DISTANCIA /12
O programa deve apresentar os valores da velocidade média, tempo gasto da viagem, a distância percorrida e a quantidade de litros utilizada.
 */
public class exercicio3 {

    public static void main(String[] args) {
        
    
    Scanner teclado = new Scanner(System.in);

    float tempo, velocidade, distancia, l_usados;

    System.out.println("Digite o tempo de viagem (em horas): ");
    tempo = teclado.nextFloat();
    System.out.println("Digite a velocidade media percorrida: ");
    velocidade = teclado.nextFloat();
    
    distancia = velocidade * tempo;
    l_usados = distancia / 12;

    System.out.println("Velocidade media: " + velocidade + "\nTempo gasto: " + tempo + "\ndistancia percorrida: " + distancia + "\nquantidade de litros utilizada: " + l_usados);
    
    teclado.close();
    }
}
