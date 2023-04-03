package Lista4;

public class Pessoa
    {
        private String cpf;
        private String nome;
        private char sexo;
        private int idade;

        public String getNome()
        {
            return nome;
        }

        public void setNome(String nome)
        {
         this.nome = nome;
        }

        public String getCPF()
        {
            return cpf;
        }

        public void setCPF(String cpf)
        {
            this.cpf = cpf;
        }

        public char getSexo()
        {
            return sexo;
        }

        public void setSexo(char sexo)
        {
            this.sexo = sexo;
        }

        public int getIdade()
        {
            return idade;
        }

        public void setIdade(int idade)
        {
            this.idade = idade;
        }

        public String imprimir()
        {
            return "\nNome: " +nome + "\nIdade: " +idade + ("\nSexo: " +sexo) + "\nCPF: " + cpf;
        }
        
        
    }