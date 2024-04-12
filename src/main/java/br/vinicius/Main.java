package br.vinicius;

import br.vinicius.alunos.Aluno;
import br.vinicius.calculadora.Calculadora;
import br.vinicius.carros.Carro;
import br.vinicius.musicas.Musica;
import br.vinicius.pessoa.Pessoa;


public class Main {
    public static void main(String[] args) {
        var pessoas = new Pessoa();
        var calc = new Calculadora(4);
        var um = new Musica("One", "Metallica", 1991);
        var fuca = new Carro("Fusca", "Marrom", 1992);
        var vinicius = new Aluno("Vinicius Oliveira Santana", 1995);

        pessoas.ola();

        System.out.println("O dobro de quatro é: " + calc.dobraNum() + "\n");

        um.exibeFichaTecnica();
        um.avalia();

        fuca.exibeFichaTecnica();
        fuca.calculaIdadeCarro();

        vinicius.exibeInfo();

    }
}