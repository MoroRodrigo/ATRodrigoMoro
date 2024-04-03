package farmaciaApp.controller;

import farmaciaApp.model.domain.Cliente;
import spark.Request;
import spark.Response;
import spark.Route;

public class ClienteController implements Route {

    @Override
    public String handle(Request request, Response response) throws Exception {

        StringBuilder html = new StringBuilder();

        Cliente cliente = new Cliente();
        
        html.append(cliente);
        
        html.append("Voltar, <a href='/'>" + cliente.getNome() + "?</a>");
        
        return html.toString();
    }
}
