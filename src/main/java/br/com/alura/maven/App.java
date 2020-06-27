package br.com.alura.maven;

public class App {

    public static void main(String[] args) {

        Produto produto = new Produto("Sorvete em pote", 20.0);

        System.out.println("Comprei " + produto.getNome() + " no valor de R$: " + produto.getPreco());
    }
}
