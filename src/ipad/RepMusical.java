package ipad;


public abstract class RepMusical {
    String nomeMusica;
    String artista;

    protected RepMusical(String nomeMusica, String artista) {
        this.nomeMusica = nomeMusica;
        this.artista = artista;
    }

    public abstract void tocarMusica();

    public abstract void pausarMusica();

    public abstract void selecionarMusica();

}
