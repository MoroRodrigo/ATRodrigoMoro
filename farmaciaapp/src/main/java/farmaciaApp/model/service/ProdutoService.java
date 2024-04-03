package farmaciaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import farmaciaApp.model.domain.Produto;

public class ProdutoService {

    private static Map<Integer, Produto> produtos = new HashMap<>();
    private static Integer id = 0;

    public static void incluir(Produto produto) {
        produto.setId(++id);
        produtos.put(produto.getId(), produto);
    }

    public static void excluir(Integer id) {
        produtos.remove(id);
    }

    public static Collection<Produto> obterLista() {
        return produtos.values();
    }

    public static Produto obterPorId(Integer id) {
        return produtos.get(id);
    }
}
