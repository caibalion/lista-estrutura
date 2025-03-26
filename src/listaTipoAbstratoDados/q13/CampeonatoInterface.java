package listaTipoAbstratoDados.q13;

public interface CampeonatoInterface {
    void adicionarTime(String nome);

    void registrarVitoria(String nomeTime);

    void registrarEmpate(String nomeTime);

    void registrarDerrota(String nomeTime);

    String exibirClassificacao();
}
