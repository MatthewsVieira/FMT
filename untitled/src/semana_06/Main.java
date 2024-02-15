package semana_06;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        teste();

    }

    public static void teste() {

        Professor professor1 = new Professor("Charles", 30);
        Aluno aluno1 = new Aluno("Zabner", 18);
        Aluno aluno2 = new Aluno("Abner", 16);
        Aluno aluno3 = new Aluno("Mabner", 15);
        Aluno aluno4 = new Aluno("Fabner", 14);
        Curso curso1 = new Curso("Geografia", professor1);
        Turma turma1 = new Turma(curso1);

        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);
        turma1.adicionarAluno(aluno4);

        turma1.listarAlunos(turma1.getListaAlunos());

    }


}
