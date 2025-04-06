package contabanco;

public class mainConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("marcos isaac", 3000.0);

        conta.depositar(500.0);
        conta.sacar(250.0);
        System.out.println("Titular: " + conta.getTitular() + " | " + "Saldo atual: " + conta.exibirSaldo());
    }
}
