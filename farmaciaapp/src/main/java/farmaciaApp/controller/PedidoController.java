package farmaciaApp.controller;

import farmaciaApp.model.domain.Pedido;
import farmaciaApp.model.service.PedidoService;
import spark.Route;

public class PedidoController {

    public static Route obterLista = (req, res) -> {
        return PedidoService.obterLista();
    };

    public static Route incluir = (req, res) -> {
        // Exemplo de como obter parâmetros da requisição
        int idCliente = Integer.parseInt(req.params("idCliente"));
        String dataPedido = req.params("dataPedido");
        
        // Criar o pedido com base nos parâmetros recebidos
        Pedido pedido = new Pedido(idCliente, dataPedido);
        
        // Chamar o serviço para incluir o pedido
        PedidoService.incluir(pedido);

        return "Inclusão realizada com sucesso: " + pedido + "!";
    };

    public static Route excluir = (req, res) -> {
        Integer id = Integer.valueOf(req.params("id"));
        Pedido pedido = PedidoService.obterPorId(id);
        PedidoService.excluir(id);
        return "Exclusão realizada com sucesso: " + pedido + "!";
    };

    public static Route obter = (req, res) -> {
        Integer id = Integer.valueOf(req.params("id"));
        Pedido pedido = PedidoService.obterPorId(id);
        return "Recuperação realizada com sucesso: " + pedido + "!";
    };
}
