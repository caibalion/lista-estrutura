package listaTipoAbstratoDados.q9;

import java.util.HashMap;

public interface PedidoInterface {
    void addPedido(String nomeCliente, HashMap<String, Integer> pedidos, double valorPedido);
}
