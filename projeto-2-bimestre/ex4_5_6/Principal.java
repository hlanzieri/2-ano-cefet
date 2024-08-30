package ex4_5_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a primeira nota parcial (0 a 100): ");
            int primeiraNota = scanner.nextInt();
            System.out.print("Digite a segunda nota parcial (0 a 100): ");
            int segundaNota = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, primeiraNota, segundaNota);
            alunos.add(aluno);
        }

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        double somaDasMedias = 0;
        for (Aluno aluno : alunos) {
            somaDasMedias += aluno.calcularMedia();
        }
        double mediaTurma = somaDasMedias / alunos.size();

        int aprovados = 0;
        int finalistas = 0;
        int reprovados = 0;

        System.out.println("\nDados dos alunos:");
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            if (media >= 60) {
                aprovados++;
            } else if (media >= 40) {
                finalistas++;
            } else {
                reprovados++;
            }
            System.out.println(aluno);
        }

        System.out.println("\nMédia da turma: " + mediaTurma);
        System.out.println("Número de alunos aprovados: " + aprovados);
        System.out.println("Número de alunos para a final: " + finalistas);
        System.out.println("Número de alunos reprovados: " + reprovados);

        System.out.println("\nAlunos com notas abaixo da média da turma:");
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() < mediaTurma) {
                System.out.println(aluno);
            }
        }

        scanner.close();
    }
}

