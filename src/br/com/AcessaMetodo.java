package br.com;

public class AcessaMetodo {

    public void imprime(){
        System.out.println("Bem Vindo ao Java!");
    }

    public static void main(String[] args) {
        AcessaMetodo acessa = new AcessaMetodo ();
        acessa.imprime();
//        imprime();

    }

}