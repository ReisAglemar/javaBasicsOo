
public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 10;
        this.ligado = false;
        this.tocando = false;
    }

    // SETTERS --------------------------------
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // GETTERS --------------------------------
    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    // SPECIAL METODS ------------------------
    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("Dispositivo ligado.");
    }

    @Override
    public void desligar() {
        setLigado(false);
        System.out.println("Dispositivo desligado");
    }

    @Override
    public void abrirMenu() {
        if (isLigado()) {
            System.out.println("--------- MENU -------");
            System.out.println("Está ligado? " + isLigado());
            System.out.println("Está tocando? " + isTocando());
            System.out.print("Volume em: " + getVolume() + " ");

            for (int i = 0; i < getVolume(); i++) {
                System.out.print("~");
            }
            System.out.println("");            
        } else {
            System.out.println("O dispositivo deve estar ligado!");
        }

    }

    @Override
    public void fecharMenu() {
        if (isLigado()) {
            System.out.println("Fechando menu...");
        } else {
            System.out.println("O dispositivo deve estar ligado!");
        }
    }

    @Override
    public void aumentarVolume() {
        if (isLigado()) {
            setVolume(getVolume() + 1);
            System.out.println("Aumentou o volume para: " +getVolume());
        }
    }

    @Override
    public void diminuirVolume() {
        if (isLigado()) {
            setVolume(getVolume() - 1);
            System.out.println("Baixou o volume para: " +getVolume());
        }
    }

    @Override
    public void ativarMudo() {

        if (getVolume() > 0 && isLigado()) {
            setVolume(0);
            System.out.println("Mudo ativado");
        } else {
            System.out.println("Volume está em zero.");
        }
    }

    @Override
    public void desativarMudo() {
        if (getVolume() == 0 && isLigado()) {
            setVolume(10);
            System.out.println("Mudo desativado");
        }
    }

    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            setTocando(true);
            System.out.println("Está tocando.");
        } else {
            System.out.println("Dispositivo já está tocando.");
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
            System.out.println("Está em pause");
        } else {
            System.out.println("Dispositivo já está em pausa");
        }
    }
}
