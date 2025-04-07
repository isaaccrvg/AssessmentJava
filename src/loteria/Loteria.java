import java.util.*;

public class Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numerosSorteados = new HashSet<>();
        Set<Integer> numerosUsuario = new HashSet<>();

        Random random = new Random();

        // Gerar 6 números aleatórios entre 1 e 60, sem repetir
        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(60) + 1);
        }

        // Pedir 6 números ao usuário
        System.out.println("Digite 6 números entre 1 e 60 (sem repetir):");
        while (numerosUsuario.size() < 6) {
            System.out.print("Número " + (numerosUsuario.size() + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Número fora do intervalo. Tente novamente.");
            } else if (!numerosUsuario.add(numero)) {
                System.out.println("Número repetido. Tente outro.");
            }
        }

        // resultados
        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados);

        System.out.println("\nNúmeros sorteados: " + numerosSorteados);
        System.out.println("Seus números:      " + numerosUsuario);
        System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);

        scanner.close();
    }
}
