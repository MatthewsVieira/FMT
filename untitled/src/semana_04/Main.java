package semana_04;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cursos = new ArrayList<String>();
        ArrayList<String> professores = new ArrayList<String>();
        ArrayList<String> cursosConcluidos = new ArrayList<String>();
        ArrayList<String> professorConcluidos = new ArrayList<String>();

        boolean bool = true;

        iniciarCursos(cursos);
        iniciarProfessores(professores);




        do {
            System.out.println();
            System.out.println("-------MENU-------");
            System.out.println("1 - LISTAR");
            System.out.println("2 - ADICIONAR");
            System.out.println("3 - REMOVER");
            System.out.println("4 - MARCAR CURSOS CONCLUÍDOS");
            System.out.println("5 - LISTAR CURSOS CONCLUÍDOS");
            System.out.println("0 - SAIR");
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            System.out.println();
            boolean loop;

            switch(opcao) {
                case 1:
                    System.out.println("-----LISTAR-----");
                    listar(cursos, professores);
                    break;
                case 2:
                        System.out.println("-----ADICIONAR-----");
                        System.out.println();
                        adicionar(sc, cursos, professores);
                    break;
                case 3:
                        System.out.println("-----REMOVER-----");
                        System.out.println();
                        listar(cursos, professores);
                        System.out.println();
                        removerItemLista(sc, cursos, professores);

                    break;
                case 4:
                    System.out.println("----MARCAR CURSOS CONCLUIDOS----");
                    System.out.println();
                    marcarConcluido(cursosConcluidos, cursos, professorConcluidos, professores ,sc);
                    break;
                case 5:
                    System.out.println("----CURSOS CONCLUIDOS----");
                    listar(cursosConcluidos, professorConcluidos);
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    bool = false;
                    break;
           }

        } while(bool);

        sc.close();

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

    public static void adicionar(Scanner sc, ArrayList<String> curso, ArrayList<String> professor) {
        System.out.print("INSIRA O CURSO: ");
        sc.nextLine();
        String nome = sc.nextLine();
        curso.add(nome);
        System.out.print("INSIRA O PROFESSOR RESPONSÁVEL: ");
        nome = sc.nextLine();
        professor.add(nome);
    }

    public static void listar(ArrayList<String> curso, ArrayList<String> professor) {
        for (int i = 0; i < curso.size(); i++) {
            System.out.println(i + " - CURSO: " + curso.get(i) + " - PROFESSOR: " + professor.get(i));
        }
    }

    public static void removerItemLista(Scanner sc, ArrayList<String> curso, ArrayList<String> professor){
        System.out.print("DIGITE O NÚMERO CORRESPONDENTE PARA REMOÇÃO: ");
        int indice = listarPedirIndice(sc);
        removerItem(curso, indice);
        removerItem(professor, indice);
    }


    public static int listarPedirIndice(Scanner sc) {
        int indice = sc.nextInt();
        return indice;
    }

    public static void removerItem(ArrayList<String> lista, int indice) {
        lista.remove(indice);
    }

    public static void marcarConcluido(ArrayList<String> cursosConcluidos, ArrayList<String> curso, ArrayList<String> professoresConcluidos, ArrayList<String> professores,Scanner sc) {
        System.out.print("DIGITE O NÚMERO CORRESPONDENTE AO INDICE DO CURSO CONCLUIDO: ");
        int indice = listarPedirIndice(sc);
        cursosConcluidos.add(curso.get(indice));
        removerItem(curso, indice);
        professoresConcluidos.add(professores.get(indice));
        removerItem(professores, indice);
    }




}
