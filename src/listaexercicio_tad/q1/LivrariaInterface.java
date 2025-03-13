package listaexercicio_tad.q1;

public interface LivrariaInterface {
    void adicionarLivro(String titulo, String editora, int anoPublicacao);

    void removerLivro(String titulo);

    String buscarLivro(String titulo);

    void listarLivros();

}
