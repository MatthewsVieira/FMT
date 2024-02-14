package semana_06;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Turma {

    private ArrayList<Aluno> listaAlunos;
    private int ano;
    private Curso curso;

    public Turma(Curso curso) {
        this.listaAlunos = new ArrayList<>();
        this.curso = curso;
        Calendar cal = GregorianCalendar.getInstance();
        this.ano = cal.get(Calendar.YEAR);
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}