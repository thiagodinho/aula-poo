package Aula28_09.Associacao;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private ArrayList<Automovel> automoveis = 
            new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }
    public void setAutomoveis(Automovel automovel){
        this.automoveis.add(automovel);
        automovel.dono = this;
    }
}

