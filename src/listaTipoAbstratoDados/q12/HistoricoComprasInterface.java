package listaTipoAbstratoDados.q12;


import java.util.List;

public interface HistoricoComprasInterface {
    void addCompras(String data, List<String> itensCompras, double valorTotal);

    void showHistorico();

}
