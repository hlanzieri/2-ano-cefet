package ex4_5_6;

public class Aluno {
    private String nome;
    private int primeiraNota;
    private int segundaNota;

    public Aluno(String nome, int primeiraNota, int segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(int primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public int getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(int segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2.0;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Nota 1: " + primeiraNota + ", Nota 2: " + segundaNota + ", Média: " + calcularMedia();
    }
}

