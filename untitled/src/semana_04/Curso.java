package semana_04;

import java.util.ArrayList;

public class Curso {
    public String nome;
    public String descricao;
    public ArrayList<String> professores;
    public int cargaHoraria;

    public void progresso() {
        System.out.println("Progredindo...");
    }

    public void notas() {
        System.out.println("Avaliando...");
    }

    public void participacao() {
        System.out.println("Participando...");
    }

}
