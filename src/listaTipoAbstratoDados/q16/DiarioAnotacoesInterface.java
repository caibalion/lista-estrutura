package listaTipoAbstratoDados.q16;

import java.util.List;

public interface DiarioAnotacoesInterface {
    void adicionarAnotacao(String data, String titulo, String conteudo);

    void removerAnotacao(String titulo);

    String buscarAnotacao(String titulo);

    List<String> listarAnotacoes();
}
