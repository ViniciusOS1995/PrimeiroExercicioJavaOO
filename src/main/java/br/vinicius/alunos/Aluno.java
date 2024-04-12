package br.vinicius.alunos;

public class Aluno {
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    private String nome;
    private int idade;

    public void exibeInfo(){
        System.out.println("Informações do aluno: ");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade+ "\n");
    }

}
