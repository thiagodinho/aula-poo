package Prova30_11;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo, double limite) {
        super(saldo, limite);
        //TODO Auto-generated constructor stub
    }

    public void atualiza(double taxa){

        saldo = saldo + (saldo*(3*taxa));
    }


    
}
