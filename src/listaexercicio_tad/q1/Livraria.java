package listaexercicio_tad.q1;

import java.util.HashMap;
import java.util.Map;

public class Livraria implements LivrariaInterface {
    private Map<String, Livro> livros = new HashMap<>();

    @Override
    public void adicionarLivro(String titulo, String editora, int anoPublicacao) {
        livros.put(titulo, new Livro(titulo, editora, anoPublicacao));
    }

    @Override
    public void removerLivro(String titulo) {
        livros.remove(titulo);
    }

    @Override
    public String buscarLivro(String titulo) {
        Livro livro = livros.get(titulo);
        return (livro != null) ? livro.toString() : "Livro não encontrado";
    }

    @Override
    public void listarLivros() {

    }
}
