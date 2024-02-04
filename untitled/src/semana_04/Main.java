package semana_04;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cursos = new ArrayList<String>();
        ArrayList<String> professores = new ArrayList<String>();
        boolean bool = true;

        iniciarCursos(cursos);
        iniciarProfessores(professores);

        do {
            System.out.println();
            System.out.println("-------MENU-------");
            System.out.println("1 - Adicionar Curso");
            System.out.println("2 - Adicionar Professor");
            System.out.println("0 - Sair");
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            System.out.println();

            switch(opcao) {
                case 1:
                    System.out.print("Insira o nome do curso: ");
                    adicionar(sc, cursos);
                    break;
                case 2:
                    System.out.print("Insira o nome do curso: ");
                    adicionar(sc, professores);
                    break;
                case 0:
                    System.out.println("Cursos:");
                    listar(cursos);
                    System.out.println();
                    System.out.println("Professores:");
                    listar(professores);
                    System.out.println();
                    System.out.println("Desligando...");
                    bool = false;
                    break;
            }

        } while(bool);

    }

    public static void iniciarCursos(ArrayList<String> lista) {
        lista.add("Geografia");
        lista.add("Sistemas da Informação");
        lista.add("História");
        lista.add("Engenharia");
        lista.add("Edificações");
    }

    public static void iniciarProfessores(ArrayList<String> lista) {
        lista.add("Arnaldo");
        lista.add("Abner");
        lista.add("Diego");
        lista.add("Marilia");
        lista.add("Sandra");
    }

    public static void adicionar(Scanner sc, ArrayList<String> lista) {
        sc.nextLine();
        String nome = sc.nextLine();
        lista.add(nome);
    }

    public static void listar(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }
    }



}
