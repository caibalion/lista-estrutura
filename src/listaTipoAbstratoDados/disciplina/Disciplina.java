package listaTipoAbstratoDados.disciplina;

public class Disciplina {
    String nome;
    String professor;
    double media;

    public Disciplina(String nome, String professor, double media) {
        this.nome = nome;
        this.professor = professor;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
