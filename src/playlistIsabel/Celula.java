package playlistIsabel;

public class Celula {
    private Musica valor;
    private Celula proximo;

    public Musica getValor() {
        return valor;
    }

    public void setValor(Musica valor) {
        this.valor = valor;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}
