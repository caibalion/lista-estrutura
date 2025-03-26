package listaTipoAbstratoDados.q15;

public interface FilaAtendimentoInterface {


    void adicionarPaciente(String nome, int prioridade, String horario);

    String atenderPaciente();

    String listarPacientes();


}
