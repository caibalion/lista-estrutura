package listaexercicio_tad.q1;

public class Livro {
    private String titulo;
    private String editora;
    private int anoPublicacao;

    public Livro(String titulo, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return titulo + " - " + editora + " - " + anoPublicacao + " disponível na Livraria!";
    }
}
