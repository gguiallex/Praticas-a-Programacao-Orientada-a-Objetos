public class Caminhao extends Veiculo {
    private int numEixos;
    private int capCarga;

    public Caminhao(String marca, String ano, String cor, int numEixos, int capCarga) {
        super(marca, ano, cor);
        this.numEixos = numEixos;
        this.capCarga = capCarga;
    }

    public String getDescricao(){
        String descricao = getDescricaoVeiculo();
        descricao += "Número de Eixos: " + numEixos + "\n" +
        "Capacidade de Carga: " + capCarga + "\n";
        return descricao;
    }
}
