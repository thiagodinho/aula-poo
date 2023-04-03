package Prova30_11;
import java.util.ArrayList;
public class Agencia {

    private String nome;
    private String endereco;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
    public void cadastrarCliente(Cliente cliente){

        clientes.add(cliente);

    }

    public void cadastrarFuncionario(Funcionario funcionario){

        funcionarios.add(funcionario);

    }

    /*public double valorTotalAgencia(){
        double soma = 0;
           for (Cliente cliente : clientes) {

                ME PERDI NA LÓGICA
           }

    }*/
}
