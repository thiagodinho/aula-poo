package Prova30_11;

public interface ContaDeBanco{
    
    public void deposita(double valor);
    public String sacar(double valor);
    public String transferir(Conta conta, double valor);
    
}
