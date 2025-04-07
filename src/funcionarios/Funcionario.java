package funcionarios;

public class Funcionario {

    public String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
