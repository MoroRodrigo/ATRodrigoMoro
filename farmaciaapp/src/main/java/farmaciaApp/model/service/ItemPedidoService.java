package farmaciaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import farmaciaApp.model.domain.ItemPedido;

public class ItemPedidoService {

    private static Map<Integer, ItemPedido> itensPedido = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(ItemPedido itemPedido) {
        itemPedido.setId(++id);
        itensPedido.put(itemPedido.getId(), itemPedido);
    }

    public static void excluir(Integer id) {
        itensPedido.remove(id);
    }

    public static Collection<ItemPedido> obterLista() {
        return itensPedido.values();
    }

    public static ItemPedido obterPorId(Integer id) {
        return itensPedido.get(id);
    }
}
