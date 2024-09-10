package ex9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Diego Martins", "123.456.789-00");

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        Emprestimo emprestimo = new Emprestimo(pessoa, livro, LocalDate.now(), LocalDate.now().plusDays(14));

        System.out.println(emprestimo);
    }
}

