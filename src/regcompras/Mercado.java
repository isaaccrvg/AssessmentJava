package regcompras;

public class Mercado {
    public String produto;
    private int quantidade;
    private double preco;

    public Mercado(String produto, int quantidade, double preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }


}
