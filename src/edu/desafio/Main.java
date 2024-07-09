package edu.desafio;

import edu.desafio.iphone.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone15 = new Iphone();

        iphone15.selecionarMusica("Can`t Stop");
        iphone15.reproduzir();
        iphone15.tocar();
        iphone15.pausar();
        iphone15.atender();
        iphone15.exibirPagina("google.com");
        iphone15.adicionarNovaAba();
        iphone15.iniciarCorreioVoz();
        iphone15.atualizarPagina();
    }
}
