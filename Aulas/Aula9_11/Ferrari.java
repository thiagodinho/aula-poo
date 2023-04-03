package Aula9_11;

import Aula28_09.Associacao.Automovel;

public class Ferrari extends Automovel implements Esportivo, Luxo {
    private int codigoFerrari;
    
    public Ferrari(String cor, int ano) {
        super(cor, ano);
    }

    public Ferrari() {
        this("", 0);
    }

    public int getCodigoFerrari() {
        return codigoFerrari;
    }

    public void setCodigoFerrari(int codigoFerrari) {
        this.codigoFerrari = codigoFerrari;
    }
    
    
    @Override
    public void acelerar() {
        super.acelerar(); 
        super.acelerar();
        super.acelerar();
    }

    @Override
    public String toString() {
        return "A cor da ferrari é " +getCor();
    }

    @Override
    public String ligarAr() {
        // TODO Auto-generated method stub
        return "ar ligado";
    }

    @Override
    public String desligarAr() {
        // TODO Auto-generated method stub
        return "ar desligado.";
    }

    @Override
    public String LigarTurbo() {
        // TODO Auto-generated method stub

        return "turbo ligado.";
        
    }

    @Override
    public String desligarTurbo() {
        // TODO Auto-generated method stub

        return "turbo desligado.";
        
    }


    
    
}
