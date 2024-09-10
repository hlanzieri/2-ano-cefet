package ex10;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public String descricaoArvoreGenealogica() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("Nome: ").append(nome).append(", Idade: ").append(idade);

        if (pai != null) {
            descricao.append("\n  Pai: ").append(pai.getNome()).append(", Idade: ").append(pai.getIdade());
        } else {
            descricao.append("\n  Pai: Desconhecido");
        }

        if (mae != null) {
            descricao.append("\n  Mãe: ").append(mae.getNome()).append(", Idade: ").append(mae.getIdade());
        } else {
            descricao.append("\n  Mãe: Desconhecida");
        }

        return descricao.toString();
    }
}
