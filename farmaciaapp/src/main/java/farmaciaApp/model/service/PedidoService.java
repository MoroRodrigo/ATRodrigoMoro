package farmaciaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import farmaciaApp.model.domain.Pedido;

public class PedidoService {

    private static Map<Integer, Pedido> pedidos = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Pedido pedido) {
        pedido.setId(++id);
        pedidos.put(pedido.getId(), pedido);
    }

    public static void excluir(Integer id) {
        pedidos.remove(id);
    }

    public static Collection<Pedido> obterLista() {
        return pedidos.values();
    }

    public static Pedido obterPorId(Integer id) {
        return pedidos.get(id);
    }
}
