package semana_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

    private String melhorJogador;
    private int numeroJogadas = 0;

    public String getMelhorJogador() {
        return melhorJogador;
    }

    public void setMelhorJogador(String melhorJogador) {
        this.melhorJogador = melhorJogador;
    }

    public int getNumeroJogadas() {
        return numeroJogadas;
    }

    public void setNumeroJogadas(int numeroJogadas) {
        this.numeroJogadas = numeroJogadas;
    }

    public static void jogar(Scanner sc, Jogador jogador) {

        Jogo pedraPapelTesoura = new Jogo();
        boolean loop = true;

        System.out.println();
        System.out.println("O JOGO COMEÇOU " + jogador.getNome() + "...");
        do {
            System.out.println();
            System.out.println("1 - PEDRA");
            System.out.println("2 - PAPEL");
            System.out.println("3 - TESOURA");
            System.out.print("FAÇA SUA JOGADA: ");
            int jogada = sc.nextInt();
            sc.nextLine();

            int random = (int) (Math.random() * 3 + 1);

            if(jogada == random) {
                System.out.println("DRAW!");
            } else if((jogada == 1 && random == 3) || (jogada == 3 && random == 2) || (jogada == 2 && random == 1)) {
                System.out.println("YOU WIN!");
                jogador.adicionaPontos();
            } else {
                System.out.println("YOU LOSE!");
                jogador.perdePontos();
            }

            jogador.adicionaTentativa();
            pedraPapelTesoura.adicionarNumeroJogadas();

            System.out.println();
            System.out.print("APERTE (Q) PARA SAIR OU QUALQUER OUTRA TECLA PARA CONTINUAR: ");
            char opcao = sc.next().charAt(0);
            loop = (Character.toLowerCase(opcao) == 'q') ? false : true ;
        } while(loop);

    }

    public static void jogar(Scanner sc, Jogador jogador, int num) {

        Jogo acheNumero = new Jogo();
        int random = (int) (Math.random() * num + 1);
        boolean loop = true;

        System.out.println();
        System.out.println("O JOGO COMEÇOU " + jogador.getNome() + "...");

        do {
            System.out.print("TENTE ACERTAR O NÚMERO ESCOLHIDO ENTRE 0 E " + num + ": ");
            int numero = sc.nextInt();
            sc.nextLine();

            if (numero == random) {
                System.out.println("YOU WIN!");
                jogador.adicionaPontos();
            } else {
                System.out.println("YOU LOSE!");
                jogador.perdePontos();
            }

            jogador.adicionaTentativa();
            acheNumero.adicionarNumeroJogadas();

            System.out.println();
            System.out.print("APERTE (Q) PARA SAIR OU QUALQUER OUTRA TECLA PARA CONTINUAR: ");
            char opcao = sc.next().charAt(0);
            loop = (Character.toLowerCase(opcao) == 'q') ? false : true ;
        } while(loop);

    }


    public void adicionarNumeroJogadas() {
        numeroJogadas += 1;
    }


}
