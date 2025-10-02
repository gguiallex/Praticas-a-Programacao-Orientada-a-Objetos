public class Carro extends Veiculo {
    private int capPortaMalas;
    private int qntdPorta;

    public Carro(String marca, String ano, String cor, int capPortaMalas, int qntdPorta){
        super(marca, ano, cor);
        this.capPortaMalas = capPortaMalas;
        this.qntdPorta = qntdPorta;
    }

    public String getDescricao(){
        String descricao = getDescricaoVeiculo();
        descricao += "Capacidade do Porta Malas: " + capPortaMalas + "\n" +
        "Número de Portas: " + qntdPorta + "\n";
        return descricao;
    }
}