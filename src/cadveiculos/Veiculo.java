package cadveiculos;

public class Veiculo {
    private String placa;
    private String modelo;
    private int fabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int fabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.fabricacao = fabricacao;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void exibirDetalhes(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + fabricacao);
        System.out.println("Quilometragem: " + quilometragem + "km");
    }

    public void registrarViagem(double km){
        if (km > 0){
            quilometragem += km;
        }else{
            System.out.println("Quilometragem inválida, informe um valor acima de 0!");
        }
    }
}
