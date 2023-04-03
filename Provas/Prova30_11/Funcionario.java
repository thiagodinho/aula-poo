package Prova30_11;
import java.util.Random;
public class Funcionario extends Pessoa {

    private int chapa;
    private double salario;

    public Funcionario(){

    }

    public Funcionario(String nome, String email, String telefone, String cpf, int chapa, double salario) {
        super();
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        Random gerador = new Random();
        this.chapa = gerador.nextInt(1001);
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0)
        this.salario = salario;
    }

    public void setBonificacao(){

        salario = salario + (salario * 0.10);
        
    }

    
}
