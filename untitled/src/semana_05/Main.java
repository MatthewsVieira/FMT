package semana_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Abner", 18, 200, 5);
        Jogador jogador2 = new Jogador("Vanderlei", 24, 500, 2);
        Jogador jogador3 = new Jogador("Lucas", 15, 180, 3);
        Jogador jogador4 = new Jogador("Amanda", 27, 554, 7);
        Jogador jogador5 = new Jogador("Tyler", 19, 50, 1);

        ArrayList<Jogador> ranking = new ArrayList<>();

        ranking.add(jogador1);
        ranking.add(jogador2);
        ranking.add(jogador3);
        ranking.add(jogador4);
        ranking.add(jogador5);

        Collections.sort(ranking);



        for (int i = 0; i < ranking.size(); i++) {
            System.out.println((i + 1) + "º Lugar: " + ranking.get(i).getNome() + " - Pontuação: " + ranking.get(i).getPontuacao());
        }

    }
}
