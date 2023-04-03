package Aula14_09;

public class AreaCircTest {
    public static void main(String[] args) {

        AreaCirc c1 = new AreaCirc(10);
        AreaCirc c2 = new AreaCirc();
        //c2.setPi(3.14);
        //AreaCirc.pi = 3.14;
        c2.setRaio((double) 10);
        System.out.println("resultado: " +c1.calcular());
        System.out.println("resultado estatico: " +AreaCirc.calcular(50.0));
        System.out.println(Math.PI);
        System.out.println(AreaCirc.pi);
    }
}
