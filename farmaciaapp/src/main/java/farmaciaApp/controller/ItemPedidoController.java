package farmaciaApp.controller;

import farmaciaApp.model.domain.ItemPedido;
import farmaciaApp.model.domain.Produto;
import farmaciaApp.model.service.ItemPedidoService;
import farmaciaApp.model.service.ProdutoService;
import spark.Route;

public class ItemPedidoController {

    public static Route incluir = (req, res) -> {
        int idPedido = Integer.parseInt(req.params("idPedido"));
        int idProduto = Integer.parseInt(req.params("idProduto"));
        int quantidade = Integer.parseInt(req.params("quantidade"));

        // Obtendo o produto com base no ID
        Produto produto = ProdutoService.obterPorId(idProduto);

        // Criando um novo ItemPedido com o produto obtido e a quantidade
        ItemPedido itemPedido = new ItemPedido(idPedido, produto, quantidade);

        // Incluindo o itemPedido
        ItemPedidoService.incluir(itemPedido);

        return "Inclusão realizada com sucesso: " + itemPedido + "!";
    };

    public static Route excluir = (req, res) -> {
        Integer id = Integer.valueOf(req.params("id"));
        ItemPedido itemPedido = ItemPedidoService.obterPorId(id);
        ItemPedidoService.excluir(id);
        return "Exclusão realizada com sucesso: " + itemPedido + "!";
    };

    public static Route obter = (req, res) -> {
        Integer id = Integer.valueOf(req.params("id"));
        ItemPedido itemPedido = ItemPedidoService.obterPorId(id);
        return "Recuperação realizada com sucesso: " + itemPedido + "!";
    };
}
