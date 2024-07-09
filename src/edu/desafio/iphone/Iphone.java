package edu.desafio.iphone;


import edu.desafio.interfaces.AparelhoTelefone;
import edu.desafio.interfaces.NavegadorInternet;
import edu.desafio.interfaces.ReprodutorMusica;

public class Iphone implements ReprodutorMusica, AparelhoTelefone, NavegadorInternet {

    //Aparelho telefone
    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para %s\n", numero);
    }

    @Override
    public void tocar() {
        System.out.println("Trim-Trim, Trim-Trim");
    }

    @Override
    public void atender() {
        System.out.println("Alo, quem fala?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Voce tem 4 novas mensagens.");
    }

    // Navegador Internet


    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo %s\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Guia: Google");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    // Reprodutor de musica
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecione a musica: ");
    }
}
