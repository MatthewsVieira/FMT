package semana_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogo jogo = new Jogo();
        inicializarJogo(sc, jogadores);
    }

    public static void menu(Scanner sc, ArrayList<Jogador> ranking) {

        boolean loop = true;

        do {
            System.out.println();
            System.out.println("********MENU********");
            System.out.println("1) Adicionar Jogador");
            System.out.println("2) Imprimir Ranking");
            System.out.println("3) Pedra, Papel, Tesoura");
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
                case 3:
                    inicializarJogo(sc, ranking);
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


    public static void imprimirRanking(ArrayList<Jogador> ranking) {
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
    }

