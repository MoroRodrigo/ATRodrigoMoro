package farmaciaApp.controller;

import farmaciaApp.model.domain.Fornecedor;
import farmaciaApp.model.service.FornecedorService;
import spark.Route;

public class FornecedorController {

    public static Route obterLista = (req, res) -> {
        return FornecedorService.obterLista();
    };

    public static Route incluir = (req, res) -> {
        String nome = req.params("nome");
        String endereco = req.params("endereco");
        String telefone = req.params("telefone");
        
        Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone);
        FornecedorService.incluir(fornecedor);
        
        return "Inclusão realizada com sucesso: " + fornecedor + "!";
    };

    public static Route excluir = (req, res) -> {
        Integer id = Integer.valueOf(req.params("id"));
        Fornecedor fornecedor = FornecedorService.obterPorId(id);
        FornecedorService.excluir(id);
        return "Exclusão realizada com sucesso: " + fornecedor + "!";
    };

    public static Route obter = (req, res) -> {
        Integer id = Integer.valueOf(req.params("id"));
        Fornecedor fornecedor = FornecedorService.obterPorId(id);
        return "Recuperação realizada com sucesso: " + fornecedor + "!";
    };
}
