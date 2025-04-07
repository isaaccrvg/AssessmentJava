package cadveiculos;

public class mainVeiculos {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("kzo-5228", "Civic", 2013, 207000);
        Veiculo v2 = new Veiculo("zno-2025", "Corolla", 2011, 12000);

        v1.registrarViagem(100);
        v2.registrarViagem(30.0);

        v1.exibirDetalhes();
        System.out.println("=====");
        v2.exibirDetalhes();

    }
}
