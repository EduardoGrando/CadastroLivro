package br.edu.unisep.CadastroLivro.model;

import java.util.Scanner;

class Livro {
    String titulo;
    String autor;
    String editora;
    int anoPublicacao;
    String isbn;

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("ISBN: " + isbn);
    }
}

public class CadastroLivros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.print("Digite o título do livro: ");
        livro.titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        livro.autor = scanner.nextLine();

        System.out.print("Digite a editora do livro: ");
        livro.editora = scanner.nextLine();

        System.out.print("Digite o ano de publicação do livro: ");
        livro.anoPublicacao = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer

        System.out.print("Digite o ISBN do livro: ");
        livro.isbn = scanner.nextLine();

        System.out.println("\nInformações do Livro Cadastrado:");
        livro.exibirInformacoes();

        scanner.close();
    }
}