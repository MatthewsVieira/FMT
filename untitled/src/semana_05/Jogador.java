package semana_05;

import java.util.ArrayList;

public class Jogador implements Comparable<Jogador>{
    private String nome;
    private int idade;
    private Integer pontuacao = 0;
    private int numeroTentativas = 0;

    public Jogador(String nome, int idade, int pontuacao, int numeroTentativas) {
        this.nome = nome;
        this.idade = idade;
        this.pontuacao = pontuacao;
        this.numeroTentativas = numeroTentativas;
    }

    public void setNome(String nome) { this.nome = nome; }

    public String getNome() { return nome; }

    public void setIdade(int idade) { this.idade = idade; }

    public int getIdade() { return idade; }

    public void setPontuacao(Integer pontuacao) { this.pontuacao = pontuacao; }

    public Integer getPontuacao() { return pontuacao; }

    public void setNumeroTentativas(int numeroTentativas) { this.numeroTentativas = numeroTentativas; }

    public int getNumeroTentativas() { return numeroTentativas; }

    public void adicionaPontos() {
        this.pontuacao += 1;
    }

    public void perdePontos() {
        if (this.pontuacao > 0){
            this.pontuacao -= 1;
        }
    }

    public void adicionaTentativa() {
        this.numeroTentativas += 1;
    }

    public void rankearJogadores() {

    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Idade: " + idade + "\n" +
               "Pontuação: " + pontuacao + "\n" +
               "Nº de Tentativas: " + numeroTentativas + "\n";
    }

    @Override
    public int compareTo(Jogador outraPontuacao) {
        if(this.getPontuacao() < outraPontuacao.getPontuacao()) {
            return 1;
        }

        if(this.getPontuacao() > outraPontuacao.getPontuacao()) {
            return -1;
        }

        return 0;
    }
}
