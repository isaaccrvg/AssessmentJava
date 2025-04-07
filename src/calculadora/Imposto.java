package calculadora;

public class Imposto {
    private String nome;
    private double salarioMensal;

    public Imposto(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public double calcularSalarioAnual() {
        return salarioMensal * 12;
    }

    public double calcularImposto() {
        double salarioAnual = calcularSalarioAnual();

        if (salarioAnual <= 22847.76) {
            return 0;
        } else if (salarioAnual <= 33919.80) {
            return salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            return salarioAnual * 0.15;
        } else {
            return salarioAnual * 0.275;
        }
    }

    public double calcularSalarioLiquido() {
        return calcularSalarioAnual() - calcularImposto();
    }

    public void exibirResultados() {
        System.out.println("\n=== Resultado ===");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Mensal: R$ %.2f%n", salarioMensal);
        System.out.printf("Salário Anual: R$ %.2f%n", calcularSalarioAnual());
        System.out.printf("Imposto a pagar: R$ %.2f%n", calcularImposto());
        System.out.printf("Salário Líquido Anual: R$ %.2f%n", calcularSalarioLiquido());
    }
}
