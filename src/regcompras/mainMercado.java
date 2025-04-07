package regcompras;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class mainMercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mercado> compras = new ArrayList<>();

        System.out.println("Cadastro de 3 compras");

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nCompra " + i + ":");

            System.out.print("Produto: ");
            String produto = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            System.out.print("Preço unitário: ");
            double preco = Double.parseDouble(scanner.nextLine());

            compras.add(new Mercado(produto, quantidade, preco));
        }

        scanner.close();

        // Salvar
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("compras.txt"))) {
            for (Mercado compra : compras) {
                writer.write(compra.toString());
                writer.newLine();
            }
            System.out.println("\nCompras salvas com sucesso no arquivo compras.txt!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }

        // conteúdo do arquivo
        System.out.println("\nCompras registradas no arquivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader("compras.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double preco = Double.parseDouble(dados[2]);

                System.out.println("Produto: " + produto + " | Quantidade: " + quantidade + " | Preço: R$ " + preco);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
