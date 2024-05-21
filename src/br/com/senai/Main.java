package br.com.senai;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner tec = new Scanner(System.in);
    static ArrayList<Livro> livros = new ArrayList<>();

    public static void main(String[] args) {

        boolean repetir = true;
        do {
            System.out.println("1- Cadastrar livro");
            System.out.println("2- Editar livro");
            System.out.println("3- Buscar livro pelo ID");
            System.out.println("4- Listar livros");
            System.out.println("5- Remover livro");
            System.out.println("9- Encerrar sistema!!");
            System.out.println("Informe a opção desejada: ");
            int opcao = tec.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar livro");
                    livros.add(cadastrarLivro());

                    break;
                case 2:
                    listarLivros();
                    System.out.println("Editar livro");
                    System.out.println("-----------------");
                    editarLivros();
                    break;
                case 3:
                    System.out.println("Buscar livro pelo ID");
                    System.out.println("-----------------");
                    buscarLivro();
                    break;
                case 4:
                    System.out.println("Listar livros");
                    System.out.println("-----------------");
                    listarLivros();
                    break;
                case 5:
                    listarLivros();
                    System.out.println("Remover livro");
                    System.out.println("-----------------");
                    removerLivro();
                    break;
                case 9:
                    System.out.println("Sistema finalizado!!");
                    repetir = false;
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (repetir);
    }
    public static Livro cadastrarLivro() {
        Livro livro = new Livro();
        System.out.println("Informe o título: ");
        livro.titulo = tec.next();
        System.out.println("Informe o autor: ");
        livro.autor = tec.next();
        System.out.println("Informe a editora: ");
        livro.editora = tec.next();
        System.out.println("Informe o ano de publicação: ");
        livro.anoPublicacao = tec.nextInt();
        System.out.println("Livro cadastrado com sucesso!!");

        return livro;

    }
    public static void editarLivros(){
        System.out.println("Digite o ID do livro a ser editado: ");
        int id = tec.nextInt();
        for(int i = 0; i < livros.size(); i++){
            if (id == i){
                System.out.println("Digite o novo título do livro:");
                String novoTitulo = tec.next();
                livros.get(i).titulo = novoTitulo;
                System.out.println("Digite o novo autor do livro:");
                String novoAutor = tec.next();
                livros.get(i).autor = novoAutor;
                System.out.println("Digite a nova editora do livro:");
                String novaEditora = tec.next();
                livros.get(i).editora = novaEditora;
                System.out.println("Digite o novo ano de publicação do livro:");
                int novoAnoPublicacao = tec.nextInt();
                livros.get(i).anoPublicacao = novoAnoPublicacao;
                System.out.println("Livro editado com sucesso.");
                return;

            }
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    public static void buscarLivro(){
        System.out.println("Digite o ID do livro a ser buscado: ");
        int id = tec.nextInt();
        for(int i = 0; i < livros.size(); i++){
            if (id == i){
                System.out.println("Id: " + i);
                System.out.println("Título: " + livros.get(i).titulo);
                System.out.println("Autor: " + livros.get(i).autor);
                System.out.println("Editora: " + livros.get(i).editora);
                System.out.println("Ano de publicação: " + livros.get(i).anoPublicacao);
                System.out.println("-----------------------");
            }
        }
    }


    public static void listarLivros(){
        if (livros.size() == 0){
            System.out.println("Nenhum livro cadastrado!!");
        }
        for(int i = 0; i < livros.size(); i++) {
            System.out.println("Id: " + i);
            System.out.println("Título: " + livros.get(i).titulo);
            System.out.println("Autor: " + livros.get(i).autor);
            System.out.println("Editora: " + livros.get(i).editora);
            System.out.println("Ano de publicação: " + livros.get(i).anoPublicacao);
            System.out.println("-----------------------");
        }
    }

    public static void removerLivro(){
        System.out.println("Digite o ID a ser removido: ");
        int id = tec.nextInt();
        for(int i = 0; i < livros.size(); i++){
            if (id == i){
                livros.remove(i);
                System.out.println("Livro removido com sucesso!!");
            }
        }
    }
}