package semana_05;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Jogador> ranking = new ArrayList<>();
        inicializarJogadores(ranking);
        Collections.sort(ranking);
        imprimirRanking(ranking);
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

