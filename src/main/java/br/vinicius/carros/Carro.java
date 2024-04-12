package br.vinicius.carros;

import java.util.Calendar;

public class Carro {
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    private String modelo;
    private String cor;
    private int ano;

    public void exibeFichaTecnica(){
        System.out.println("Carro Selecionado:");
        System.out.println("Modelo: "+ modelo);
        System.out.println("Cor: "+ cor);
        System.out.println("Ano: " +ano +"\n");
    }

    public void calculaIdadeCarro(){
        Calendar calendar = Calendar.getInstance();
        int idade = calendar.get(Calendar.YEAR) - ano;
        if (idade < 4){
            System.out.println("Esse carro é novo tem somente " +idade+" anos!\n");
        } else if (idade <= 10) {
            System.out.println("Esse carro está um pouco velho tem " +idade+ " anos!\n");
        } else if (idade <= 25) {
            System.out.println("Esse carro já é velho tem "+idade+" anos!\n");
        } else {
            System.out.println("Esse carro é muito velho tem "+idade+" anos! pode até ser uma antiguidade!\n");
        }
    }
}
