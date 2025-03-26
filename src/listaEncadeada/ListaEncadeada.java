/*package listaEncadeada;

public class ListaEncadeada {
    private Celula primeiro;
    private Celula ultimo;
    private Celula posicaoAtual;

    public Celula getPosicaoAtual() {
        return posicaoAtual;
    }

    public void adicionar(Contato valor) {
        Celula celula = new Celula();
        celula.setValor(valor);
        if (primeiro == null && ultimo == null) {
            primeiro = celula;
            ultimo = celula;
        } else {
            ultimo.setProximo(celula);
            ultimo = celula;
        }
    }

    public boolean temProximo() {
        if (primeiro == null) {
            return false;
        } else if (posicaoAtual == null) {
            posicaoAtual = primeiro;
            return true;
        } else {
            boolean temProximo = posicaoAtual.getProximo() != null;
            posicaoAtual = posicaoAtual.getProximo();
            return temProximo;
        }
    }
}
*/