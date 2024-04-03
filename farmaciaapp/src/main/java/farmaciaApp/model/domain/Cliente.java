package farmaciaApp.model.domain;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    
    // Construtor padrão sem argumentos
    public Cliente() {
        // Inicializa os atributos com valores padrão
        this.id = 0;
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
    }
    
    // Construtor
    public Cliente(int id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    // Métodos Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    // Método toString para representação textual do objeto
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
