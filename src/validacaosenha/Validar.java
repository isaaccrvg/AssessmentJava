package validacaosenha;

import java.util.Scanner;

public class Validar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        Senha senhaUsuario = new Senha();
        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.print("Digite uma senha: ");
            String entradaSenha = scanner.nextLine();

            try {
                // Tenta definir a senha utilizando o setter, que realiza a validação
                senhaUsuario.setSenha(entradaSenha);
                senhaValida = true;
            } catch (Exception e) {
                // Em caso de erro, exibe a mensagem retornada pela exceção
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Cadastro concluído! Seja bem vindo, " + nome + "!");
        scanner.close();
    }
}
