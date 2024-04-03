package farmaciaApp.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import farmaciaApp.model.domain.Fornecedor;

public class FornecedorService {

    private static Map<Integer, Fornecedor> fornecedores = new HashMap<Integer, Fornecedor>();
    private static Integer id = 0;

    public static void incluir(Fornecedor fornecedor) {
        fornecedor.setId(++id);
        fornecedores.put(fornecedor.getId(), fornecedor);
    }

    public static void excluir(Integer id) {
        fornecedores.remove(id);
    }

    public static Collection<Fornecedor> obterLista() {
        return fornecedores.values();
    }

    public static Fornecedor obterPorId(Integer id) {
        return fornecedores.get(id);
    }
}
