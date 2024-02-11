package semana_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jogador> ranking = new ArrayList<>();
//        inicializarJogadores(ranking);
        menu(sc, ranking);
    }

    public static void menu(Scanner sc, ArrayList<Jogador> ranking) {

        boolean loop = true;

        do {
            System.out.println();
            System.out.println("********MENU********");
            System.out.println("1) Adicionar Jogador");
            System.out.println("2) Imprimir Ranking");
            System.out.println("0) Sair");
            System.out.println("********************");
            System.out.println();
            System.out.print("DIGITE UMA OPÇÃO: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    adicionarJogador(sc, ranking);
                    break;
                case 2:
                    Collections.sort(ranking);
                    imprimirRanking(ranking);
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    loop = false;
                    break;
            }

        } while(loop);
    }

    public static void adicionarJogador(Scanner sc, ArrayList<Jogador> ranking) {

        boolean loop = true;
        String nomeIgual = "";

        do {

            System.out.println();
            System.out.print("NOME DE USUÁRIO: ");
            String nome = sc.nextLine();
            System.out.print("IDADE: ");
            int idade = sc.nextInt();
            sc.nextLine();

            for (Jogador jogador : ranking){
                if (jogador.getNome().equalsIgnoreCase(nome)) {
                    nomeIgual = nome;
                    System.out.println("ESSE JOGADOR JÁ EXISTE!");
                    System.out.println("DIGITE NOVAMENTE!");
                    break;
                }
            }

            if(nomeIgual != nome) {
                ranking.add(new Jogador(nome, idade, 0,0));
                loop = false;
            }

        } while(loop);
    }

    public static void inicializarJogadores(ArrayList<Jogador> ranking){
        ranking.add(new Jogador ("Abner", 18, 200, 5));
        ranking.add(new Jogador ("Vanderlei", 24, 500, 2));
        ranking.add(new Jogador ("Lucas", 15, 180, 3));
        ranking.add(new Jogador ("Amanda", 27, 554, 7));
        ranking.add(new Jogador ("Tyler", 19, 50, 1));
        ranking.add(new Jogador ("Mot", 19, 60, 1));
        ranking.add(new Jogador ("Fat", 19, 80, 1));
        ranking.add(new Jogador ("Thin", 19, 70, 1));
        ranking.add(new Jogador ("Young", 19, 10, 1));
        ranking.add(new Jogador ("Old", 19, 93, 1));
        ranking.add(new Jogador ("New", 19, 88, 1));
    }

    public static void imprimirRanking(ArrayList<Jogador> ranking) {
            if(ranking.size() >= 10) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(ranking.get(i).getNome() + " - " + (i + 1) + "º Lugar");
                }
            } else {
                for (int i = 0; i < ranking.size(); i++) {
                    System.out.println(ranking.get(i).getNome() + " - " + (i + 1) + "º Lugar");
                }
            }
        }
    }

