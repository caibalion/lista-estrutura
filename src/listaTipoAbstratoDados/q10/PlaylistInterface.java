package listaTipoAbstratoDados.q10;

public interface PlaylistInterface {
    void adicionarMusica(String titulo, String artista, String duracao);

    void removerMusica(String titulo);

    void listarMusicas();
}
