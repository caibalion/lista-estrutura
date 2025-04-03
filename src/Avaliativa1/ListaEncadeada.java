package Avaliativa1;

public class ListaEncadeada {
    private Celula primeiro;
    private Celula ultimo;
    private Celula posicaoAtual;

    public void adicionar(Numero valor) {
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

    public void listar() {
        if (primeiro == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        Celula atual = primeiro;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }

    public void remover() {
        if (primeiro.getProximo() != null) {
            Celula celula = this.recuperarPenultimo(primeiro);
            ultimo = celula;
            celula.setProximo(null);
        } else {
            primeiro = ultimo = null;
        }

    }


    private Celula recuperarPenultimo(Celula celula) {
        if (celula.getProximo().equals(ultimo)) {
            return celula;
        }
        return recuperarPenultimo(celula.getProximo());
    }

    public boolean temProximo() {
        if (primeiro == null) {
            return false;
        } else if (posicaoAtual == null) {
            posicaoAtual = primeiro;
            return true;
        } else {
            boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
            posicaoAtual = posicaoAtual.getProximo();
            return temProximo;
        }

    }

    public Celula getPosicaoAtual() {
        return posicaoAtual;
    }
}
