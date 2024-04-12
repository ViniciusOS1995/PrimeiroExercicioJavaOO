package br.vinicius.musicas;

import java.util.Scanner;

public class Musica {
    public Musica(String nomeMusica, String artista, int anoLancamento) {
        this.nomeMusica = nomeMusica;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
    }
    Scanner leitura = new Scanner(System.in);
    private String nomeMusica;
    private String artista;
    private int anoLancamento;
    private int totalAv;
    private int avaliacao;
    private Double mediaAv;

    public void exibeFichaTecnica(){
        System.out.println("Musica do momento: " + nomeMusica);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento +"\n");
    }

    public void avalia(){
        totalAv++;
        System.out.println("Qual nota você da para essa musica?");
        avaliacao = leitura.nextInt();
        while (avaliacao > 11) {
            System.out.println("Valor inadequado para avaliação, digite um valor valido.");
            avaliacao = leitura.nextInt();
        }
        mediaAv = (double) (avaliacao/totalAv);
        System.out.println("A media das Avaliações dessa musica é: " + mediaAv +"\n");
    }
}
