package ipadApps;

import ipad.RepMusical;

public class Itunes extends RepMusical {
    public Itunes(String nomeMusica, String artista) {
        super(nomeMusica, artista);
    }

    public void tocarMusica() {
        System.out.println("Tocando música no iTunes...");
    }

    public void pausarMusica() {
        System.out.println("Música pausada no iTunes.");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada no iTunes.");
    }
}
