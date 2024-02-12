package semana_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogo jogo = new Jogo();

        do {
            inicializarJogo(sc, jogadores);
        } while(menuPosJogo(sc, jogadores));
    }

    public static boolean menuPosJogo(Scanner sc, ArrayList<Jogador> ranking) {

        boolean loop = true;

        do {
            System.out.println();
            System.out.println("**********MENU-PÓS-JOGO**********");
            System.out.println("1) RANKING COMPLETO");
            System.out.println("2) TOP 10");
            System.out.println("3) JOGAR NOVAMENTE");
            System.out.println("0) ENCERRAR JOGO");
            System.out.println("********************");
            System.out.println();
            System.out.print("DIGITE UMA OPÇÃO: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    Collections.sort(ranking);
                    imprimirRankingCompleto(ranking);
                    break;
                case 2:
                    Collections.sort(ranking);
                    imprimirRankingTop10(ranking);
                    break;
                case 3:
                    loop = false;
                    break;
                case 0:
                    System.out.println("ENCERRANDO...");
                    return false;
            }

        } while(loop);

        return true;
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

            if (nomeIgual != nome) {
                ranking.add(new Jogador(nome, idade, 0,0));
                loop = false;
            }

        } while (loop);

        escolherJogo(sc, ranking.get(ranking.size() - 1));
    }

    public static void inicializarJogo(Scanner sc, ArrayList<Jogador> ranking){

        System.out.println("BEM VINDO");
        System.out.println();
        if (ranking.isEmpty()) {
            System.out.println("PERCEBEMOS QUE NÃO EXISTE NENHUM USUÁRIO NESSE SISTEMA...");
            System.out.println("POR FAVOR, CRIE UM...");
            adicionarJogador(sc, ranking);
        } else {
            System.out.println("VOCÊ DESEJA:");
            System.out.println("------------------------------------");
            System.out.println("1 - JOGAR COM UM NOVO USUÁRIO");
            System.out.println("2 - JOGAR COM UM USUÁRIO EXISTENTE");
            System.out.println("------------------------------------");
            System.out.print("DIGITE UMA OPÇÃO: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------------------");

            if (opcao == 1) {
                adicionarJogador(sc, ranking);
            } else if (opcao == 2) {
                System.out.println("LISTA DE JOGADORES CADASTRADOS:");
                for (int i = 0; i < ranking.size(); i++) {
                    System.out.println(i + " - " + ranking.get(i).getNome());
                }
                System.out.println();
                System.out.print("DIGITE O NÚMERO RESPECTIVO AO SEU NOME: ");
                int id = sc.nextInt();
                sc.nextLine();
                escolherJogo(sc, ranking.get(id));
            }
        }
    }

    public static void escolherJogo(Scanner sc, Jogador jogador) {
        System.out.println();
        System.out.println("ESCOLHA UM DOS JOGOS:");
        System.out.println("1 - PEDRA, PAPEL, TESOURA");
        System.out.println("2 - ACHE O NÚMERO");
        System.out.print("OPÇÃO: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        switch(opcao) {
            case 1:
                Jogo.jogar(sc, jogador);
                break;
            case 2:
                System.out.print("ESCOLHA A QUANTIDADE DE NÚMEROS QUE VAI TER NO JOGO: ");
                int quantidadeN = sc.nextInt();
                sc.nextLine();
                Jogo.jogar(sc, jogador, quantidadeN);
        }
    }


    public static void imprimirRankingTop10(ArrayList<Jogador> ranking) {
        if (ranking.size() >= 10) {
            for (int i = 0; i < 10; i++) {
                System.out.println(ranking.get(i).getNome() + " - " + (i + 1) + "º Lugar - Pontuação: " + ranking.get(i).getPontuacao());
            }
        } else {
            for (int i = 0; i < ranking.size(); i++) {
                System.out.println(ranking.get(i).getNome() + " - " + (i + 1) + "º Lugar - Pontuação: " + ranking.get(i).getPontuacao());
            }
       }
    }

    public static void imprimirRankingCompleto(ArrayList<Jogador> ranking) {
        for (int i = 0; i < ranking.size(); i++) {
            System.out.println(ranking.get(i).getNome() + " - " + (i + 1) + "º Lugar - Pontuação: " + ranking.get(i).getPontuacao());
        }
    }

}


