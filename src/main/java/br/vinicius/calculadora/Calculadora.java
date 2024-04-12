package br.vinicius.calculadora;

public class Calculadora {
    public Calculadora(int num) {
        this.num = num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    private int num;

    public int dobraNum(){
        num*=2;
        return num;
    }
}
