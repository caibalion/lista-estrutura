package Avaliativa1;

public class Celula {
    private Numero valor;
    private Celula proximo;

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Numero getValor() {
        return valor;
    }

    public void setValor(Numero valor) {
        this.valor = valor;
    }
}
