package farmaciaApp;

import farmaciaApp.controller.FuncionarioController;
import farmaciaApp.controller.ClienteController;
import spark.Spark;

public class App {

    public static void main(String[] args) {

        // Configura a porta do servidor Spark
        Spark.port(9090);

        // Define a rota raiz para servir o arquivo index.html
        Spark.get("/", (req, res) -> {
            return App.class.getResourceAsStream("/index.html");
        });

        // Rotas para clientes
        Spark.get("/cliente", new ClienteController());

        // Rotas para funcionários
        Spark.get("/funcionario/lista", FuncionarioController.obterLista);
        Spark.get("/funcionario/incluir", FuncionarioController.incluir);
        Spark.get("/funcionario/excluir/:id", FuncionarioController.excluir);
        Spark.get("/funcionario/:id", FuncionarioController.obter);
    }
}
