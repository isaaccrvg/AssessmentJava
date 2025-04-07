package emprestimo;
import java.util.Scanner;

public class mainSimulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo: R$ ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o número de parcelas (mínimo 6, máximo 48): ");
        int parcelas = scanner.nextInt();

        if (parcelas < 6 || parcelas > 48) {
            System.out.println("Número de parcelas inválido. Tente novamente com um valor entre 6 e 48.");
        } else {
            nomeValor cliente = new nomeValor(nome, valor, parcelas);
            cliente.exibirResumo();
        }

        scanner.close();
    }
}
