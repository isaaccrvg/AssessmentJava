package calculadora;

import java.util.Scanner;

public class mainImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal: R$ ");
        double salarioMensal = Double.parseDouble(scanner.nextLine());

        Imposto imposto = new Imposto(nome, salarioMensal);
        imposto.exibirResultados();

        scanner.close();
    }
}
