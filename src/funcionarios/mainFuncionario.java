package funcionarios;

public class mainFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Vasco",30000.0);
        Estagiario estagiario = new Estagiario("da gama",2000.0);

        System.out.println("Salário do gerente " + gerente.nome + ": R$" + gerente.calcularSalario());
        System.out.println("Salário do estagiário " + estagiario.nome + ": R$" + estagiario.calcularSalario());
    }
}
