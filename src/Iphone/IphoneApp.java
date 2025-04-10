package Iphone;

import InternetApps.Chrome;
import InternetApps.Instagram;
import InternetApps.Safari;
import internet.Email;
import internet.Navegador;
import ipad.RepMusical;
import ipadApps.Itunes;
import ipadApps.Spotify;
import telefone.Contato;
import telefone.Telefone;

public class IphoneApp {

    public static void main(String[] args) {
        Navegador navegador = null;
        String navegadorEscolhido = "Safari";

        if (navegadorEscolhido.equalsIgnoreCase("Safari")) {
            navegador = new Safari("https://www.google.com");
        } else if (navegadorEscolhido.equalsIgnoreCase("Chrome")) {
            navegador = new Chrome("https://www.google.com");
        } else {
            System.out.println("Navegador não encontrado.");
        }

        if (navegador != null) {
            navegador.exibirPagina();
            navegador.adicionarNovaAba();
            navegador.atualizarPagina();
        }

        Email email = new Email("algumemail@email.com");
        email.enviarEmail();
        email.excluirEmail();

        RepMusical reprodutorMusical = null;
        String reprodutorMusicalEscolhido = "Spotify";

        if (reprodutorMusicalEscolhido.equalsIgnoreCase("Spotify")) {
            reprodutorMusical = new Spotify("Tempo Perdido", "Legiao Urbana");
        } else if (reprodutorMusicalEscolhido.equalsIgnoreCase("Itunes")) {
            reprodutorMusical = new Itunes("Matue", "V de Vilao");
        } else {
            System.out.println("Reprodutor não encontrado.");
        }

        if (reprodutorMusical != null) {
            reprodutorMusical.tocarMusica();
            reprodutorMusical.pausarMusica();
            reprodutorMusical.selecionarMusica();
        }

        Telefone telefone = new Telefone("83444555666");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        Contato contato = new Contato("Joao", "Pedro", telefone, email);
        contato.criarContato();

        Instagram instagram = new Instagram("Joao", "senha098");
        instagram.tirarFoto();
        instagram.gravarVideo();
    }
}

