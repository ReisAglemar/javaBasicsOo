package reis.praticando;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + " login=" + login + ", totAssistido=" + totAssistido + '}';
    }

}
