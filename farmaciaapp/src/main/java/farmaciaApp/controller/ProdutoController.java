package farmaciaApp.controller;

import farmaciaApp.model.domain.Produto;
import farmaciaApp.model.service.ProdutoService;
import spark.Route;

public class ProdutoController {

    public static Route obterLista = (req, res) -> {
        return ProdutoService.obterLista();
    };

    public static Route incluir = (req, res) -> {
        String nome = req.params("nome");
        double preco = Double.parseDouble(req.params("preco"));
        String categoria = req.params("categoria");
        String descricao = req.params("descricao");
        Produto produto = new Produto(nome, preco, categoria, descricao);
        ProdutoService.incluir(produto);

        return "Inclusão realizada com sucesso: " + produto + "!";
    };

    public static Route excluir = (req, res) -> {
        Integer id = Integer.valueOf(req.params("id"));
        Produto produto = ProdutoService.obterPorId(id);
        ProdutoService.excluir(id);
        return "Exclusão realizada com sucesso: " + produto + "!";
    };

    public static Route obter = (req, res) -> {
        Integer id = Integer.valueOf(req.params("id"));
        Produto produto = ProdutoService.obterPorId(id);
        return "Recuperação realizada com sucesso: " + produto + "!";
    };
}
