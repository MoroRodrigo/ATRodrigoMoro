package farmaciaApp.model.domain;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    
    // Construtor padrão
    public Funcionario() {
        // Inicializa os atributos com valores padrão
        this.id = 0;
        this.nome = "";
        this.cargo = "";
        this.salario = 0.0;
    }
    
    // Construtor
    public Funcionario(int id, String nome, String cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    // Construtor com nome como argumento
    public Funcionario(String nome) {
        this.nome = nome;
        // Define outros atributos com valores padrão
        this.id = 0;
        this.cargo = "";
        this.salario = 0.0;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método toString para representação textual do objeto
    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
