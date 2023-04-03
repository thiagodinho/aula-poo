package Lista1;

/*Desenvolver um programa utilizando os conceitos de variáveis para resolver a expressão matemática abaixo sendo que o resultado é 125. */

public class exercicio6 {

    public static void main(String[] args) {
        
        double a, b, c, d, res;

        a = ((Math.pow(6*(3+2),2))/(3*2));
        b = (Math.pow(((1-5)*(2-7))/2,2));
        c = Math.pow((a - b), 3);
        d = Math.pow(10, 3);
        res = c / d;
 
        System.out.println("Resultado: " + res);

    }
    
}
