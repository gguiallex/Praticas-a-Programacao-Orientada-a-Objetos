public class Veiculo {
    private String marca;
    private String ano;
    private String cor;

    public Veiculo(String marca, String ano, String cor){
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    public String getDescricaoVeiculo(){
        return "Marca: "+ marca + "\n" +
        "Ano: " + ano + "\n" +
        "Cor: " + cor + "\n";
    }
}