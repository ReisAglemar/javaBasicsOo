package reis.praticando;

public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(espectador.getTotAssistido() + 1);
        this.filme.setViews(filme.getViews() + 1);
        ganharxp(espectador);

    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar() {
        filme.setAvaliacao(1);
    }

    public void avaliar(int nota) {
        filme.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        filme.setAvaliacao((int) porcentagem);
    }

    public void ganharxp(Gafanhoto espectador) {

        if (espectador.getTotAssistido() > 10.0f) {
            espectador.setExperiencia(espectador.getExperiencia() + 0.5f);
        } else {
            espectador.setExperiencia(espectador.getExperiencia() + 1.0f);
        }
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }

}
