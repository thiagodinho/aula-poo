package Lista4;

public class Aluno {

    private String ra, nome;
    private float AC1, AC2, AG, AF; 

    public String getNome()
        {
            return nome;
        }

        public void setNome(String nome)
        {
         this.nome = nome;
        }
        
        public String getRA()
        {
            return ra;
        }

        public void setRA(String ra)
        {
         this.ra = ra;
        }

        public float getAC1()
        {
            return AC1;
        }

        public void setAC1(float AC1)
        {
         this.AC1 = AC1;
        }

        public float getAC2()
        {
            return AC2;
        }

        public void setAC2(float AC2)
        {
         this.AC2 = AC2;
        }

        public float getAG()
        {
            return AG;
        }

        public void setAG(float AG)
        {
         this.AG = AG;
        }

        public float getAF()
        {
            return AF;
        }

        public void setAF(float AF)
        {
         this.AF = AF;
        }

        public float CalcularMedia()
        {
            return (float) ((AC1 * 0.15) + (AC2 *0.30) + (AG * 0.10) + (AF * 0.45));
        }

        public String VerificarAprovacao()
        {
            if (CalcularMedia() >= 5)
            return "Aprovado!";
            
            else
            return "Reprovado!";
        }

        public String Imprimir()
        {
            return "RA: " +ra + "\nNOME: " +nome + "\nAC1: " +AC1 + "\nAC2: " + AC2 + "\nAG: " + AG + "\nAF: " + AF + "\nMedia: " + CalcularMedia() + "\nSituacao: " + VerificarAprovacao();
        }

}
