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
            System.out.println("1 - LISTAR");
            System.out.println("2 - ADICIONAR");
            System.out.println("3 - REMOVER");
            System.out.println("0 - SAIR");
            System.out.println();

            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            System.out.println();
            boolean loop;

            switch(opcao) {
                case 1:
                    loop = true;
                    while(loop) {
                        System.out.println("-----LISTAR-----");
                        System.out.println("1 - CURSOS");
                        System.out.println("2 - PROFESSORES");
                        System.out.print("DIGITE A OPÇÃO DESEJADA: ");
                        opcao = sc.nextInt();
                        System.out.println();
                        switch(opcao){
                            case 1:
                                System.out.println("CURSOS: ");
                                listar(cursos);
                                loop = false;
                                break;
                            case 2:
                                System.out.println("PROFESSORES: ");
                                listar(professores);
                                loop = false;
                                break;
                            default:
                                System.out.println("*DIGITE UMA OPÇÃO VÁLIDA*");
                                System.out.println();
                                break;
                        }
                    }
                    break;
                case 2:
                    loop = true;
                    while(loop) {
                        System.out.println("-----ADICIONAR-----");
                        System.out.println("1 - CURSOS");
                        System.out.println("2 - PROFESSORES");
                        System.out.print("DIGITE A OPÇÃO DESEJADA: ");
                        opcao = sc.nextInt();
                        System.out.println();
                        switch(opcao){
                            case 1:
                                System.out.println("CURSOS: ");
                                System.out.print("INSIRA O CURSO: ");
                                adicionar(sc, cursos);
                                loop = false;
                                break;
                            case 2:
                                System.out.println("PROFESSORES: ");
                                System.out.print("INSIRA O PROFESSOR: ");
                                adicionar(sc, professores);
                                loop = false;
                                break;
                            default:
                                System.out.println("*DIGITE UMA OPÇÃO VÁLIDA*");
                                System.out.println();
                                break;
                        }
                    }
                    break;
                case 3:
                    loop = true;
                    while(loop) {
                        System.out.println("-----REMOVER-----");
                        System.out.println("1 - CURSOS");
                        System.out.println("2 - PROFESSORES");
                        System.out.print("DIGITE A OPÇÃO DESEJADA: ");
                        opcao = sc.nextInt();
                        System.out.println();
                        switch(opcao){
                            case 1:
                                System.out.println("CURSOS: ");
                                listar(cursos);
                                System.out.println();
                                removerItemLista(sc, cursos);
                                loop = false;
                                break;
                            case 2:
                                System.out.println("PROFESSORES: ");
                                listar(professores);
                                System.out.println();
                                removerItemLista(sc, professores);
                                loop = false;
                                break;
                            default:
                                System.out.println("*DIGITE UMA OPÇÃO VÁLIDA*");
                                System.out.println();
                                break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("SAINDO...");
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

    public static void removerItemLista(Scanner sc, ArrayList<String> lista){
        removerItem(lista, listarPedirIndice(sc));
    }


    public static int listarPedirIndice(Scanner sc) {
        System.out.print("ESCOLHA UM INDICE DA LISTA PARA REMOÇÃO: ");
        int indice = sc.nextInt();
        return indice;
    }

    public static void removerItem(ArrayList<String> lista, int indice) {
        lista.remove(indice);
    }



}
