package emprestimo;

public class nomeValor {

    private String nome;
    private double valorEmprestimo;
    private int parcelas;
    private static final double JUROS_MENSAL = 0.03;

    public nomeValor(String nome, double valorEmprestimo, int parcelas) {
        this.nome = nome;
        this.valorEmprestimo = valorEmprestimo;
        this.parcelas = parcelas;
    }

    public double calcularValorTotal() {
        // Fórmula de juros compostos: M = P * (1 + i)^n
        return valorEmprestimo * Math.pow(1 + JUROS_MENSAL, parcelas);
    }

    public double calcularValorParcela() {
        return calcularValorTotal() / parcelas;
    }

    public void exibirResumo() {
        System.out.println("\n--- Simulação de Empréstimo ---");
        System.out.println("Cliente: " + nome);
        System.out.printf("Valor do Empréstimo: R$ %.2f\n", valorEmprestimo);
        System.out.println("Parcelas: " + parcelas);
        System.out.printf("Valor Total com Juros: R$ %.2f\n", calcularValorTotal());
        System.out.printf("Valor de Cada Parcela: R$ %.2f\n", calcularValorParcela());
    }
}
