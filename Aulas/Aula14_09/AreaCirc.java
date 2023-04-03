package Aula14_09;

public class AreaCirc {

    public static double pi = 3.14;
    private double raio;
    

    public AreaCirc( double raio)
    {
        this.raio = raio;
    }

    public AreaCirc()
    {

    }

    public double calcular()
    {
        return pi*Math.pow(raio, 2);
    }

    public double calcular(float raio)
    {
        return pi * raio * raio;
    }


    public static double calcular(double raio)
    {
        return pi * raio * raio;
    }

    public double getPi ()
    {
        return pi;
    }

    public double getRaio ()
    {
        return raio;
    }

    public void setRaio (Double raio)
    {
        this.raio = raio;
    }

    

}