package farmaciaApp.model.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<ItemPedido> itens;
    
 // Construtor
    public Pedido(int id, Date data, Cliente cliente, Funcionario funcionario, List<ItemPedido> itens) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.itens = itens;
    }
    
    // Construtor adicional
    public Pedido(int idCliente, String dataPedido) {
        this.id = idCliente;
        this.cliente = null;
        this.funcionario = null;
        this.itens = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            this.data = dateFormat.parse(dataPedido);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    // Métodos Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
    
    // Método toString para representação textual do objeto
    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                ", itens=" + itens +
                '}';
    }
}
