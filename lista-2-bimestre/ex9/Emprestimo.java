package ex9;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Pessoa pessoa, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    @Override
    public String toString() {
        return "Empréstimo:\n" + pessoa.toString() + "\n" + livro.toString() +
               "\nData do Empréstimo: " + dataEmprestimo + "\nData de Devolução: " + dataDevolucao;
    }
}

