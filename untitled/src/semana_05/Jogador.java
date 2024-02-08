package semana_05;

public class Jogador {
    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

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

    public void setPontuacao(int pontuacao) { this.pontuacao = pontuacao; }

    public int getPontuacao() { return pontuacao; }

    public void setNumeroTentativas(int numeroTentativas) { this.numeroTentativas = numeroTentativas; }

    public int getNumeroTentativas() { return numeroTentativas; }

    public void adicionaPontos() {

    }

    public void perdePontos() {

    }

    public void adicionaTentativa() {

    }

}
