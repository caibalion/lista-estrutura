package listaTipoAbstratoDados.q16;

import java.util.List;

public class Diario implements DiarioAnotacoesInterface {

    @Override
    public void adicionarAnotacao(String data, String titulo, String conteudo) {

    }

    @Override
    public void removerAnotacao(String titulo) {

    }

    @Override
    public String buscarAnotacao(String titulo) {
        return "";
    }

    @Override
    public List<String> listarAnotacoes() {
        return List.of();
    }
}
