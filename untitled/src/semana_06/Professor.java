package semana_06;

public class Professor extends Funcionario {

    private String nome;
    private int idade;

    public Professor(String nome, int idade, int tempoTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.tempoTrabalho = tempoTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
