package listaTipoAbstratoDados.disciplina;

import java.util.ArrayList;

public class HistoricoEscolar implements InterfaceDisciplina {
    private ArrayList<Disciplina> disciplinas;
    public HistoricoEscolar() {
        this.disciplinas = new ArrayList<>();

    }


    @Override
    public void adicionaDisciplina(String nome, String professor, double media) {
    disciplinas.add(new Disciplina(nome, professor, media));

    }

    @Override
    public void listaDisciplinas() {
        if(disciplinas.isEmpty()) {
            System.out.println("Nenhum disciplina encontrado");
            return;
        }
        for (Disciplina d : disciplinas) {
            System.out.println(d);
        }
    }
}
