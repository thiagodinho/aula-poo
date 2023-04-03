package Prova30_11;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
        //TODO Auto-generated constructor stub
    }

    public void deposita(double valor){
    
        super.deposita(valor - 0.10);

    }

    public void atualiza(double taxa){

        saldo = saldo + (saldo*(2*taxa));

    }

    
    
}
