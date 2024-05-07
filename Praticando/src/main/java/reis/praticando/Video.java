package reis.praticando;

public class Video implements AcoesVideos {

    private String titulo;
    private int views, curtidas, avaliacao;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void like() {
    }

    @Override
    public String toString() {
        return "{" + "titulo=" + titulo
                + ", views=" + views
                + ", curtidas=" + curtidas
                + ", avaliacao=" + avaliacao
                + ", reproduzindo=" + reproduzindo
                + '}';
    }

}
