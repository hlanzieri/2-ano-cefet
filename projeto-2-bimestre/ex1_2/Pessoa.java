package ex1_2;
import java.time.LocalDate;

public class Pessoa{
    private int idade;
    private String nome_da_pessoa;
    private int dia_nascimento, mes_nascimento, ano_nascimento;


public Pessoa(String nome_da_pessoa, int dia_nascimento, int mes_nascimento, int ano_nascimento) {
    this.nome_da_pessoa = nome_da_pessoa;
    this.dia_nascimento = dia_nascimento;
    this.mes_nascimento = mes_nascimento;
    this.ano_nascimento = ano_nascimento;
    calculaIdade(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
}

public void calculaIdade(int dia_atual, int mes_atual, int ano_atual) {
    int idadeCalculada = ano_atual - ano_nascimento;
    if (mes_atual < mes_nascimento || (mes_atual == mes_nascimento && dia_atual < dia_nascimento)) {
        idadeCalculada--;
    }
    this.idade = idadeCalculada;
}

public int informaIdade() {
    return idade;
}

public String informaNome() {
    return nome_da_pessoa;
}
}