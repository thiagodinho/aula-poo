package Prova30_11;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    private ArrayList<Conta> contas = new ArrayList<>();

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas, Conta conta) {
        this.contas = contas;
        
        contas.add(conta);
        
    }

    public void cadastraConta(double saldo, double limite){


    }
    
}
