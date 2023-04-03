package Prova30_11;
public class Conta implements ContaDeBanco{

    protected double saldo;
    private double limite;

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void deposita(double valor){

        this.saldo = this.saldo + valor;

    }

    @Override
    public String sacar(double valor){

        if((this.saldo+this.limite) > valor){

            this.saldo = this.saldo - valor;
            return "ok";
        }

        else
        return "Valor indisponível.";
    }
    public void atualiza(double taxa){

        saldo = saldo + (saldo*taxa);

    }
    @Override
    public String transferir(Conta conta, double valor) {
        // TODO Auto-generated method stub
        return null;
    }   
}
