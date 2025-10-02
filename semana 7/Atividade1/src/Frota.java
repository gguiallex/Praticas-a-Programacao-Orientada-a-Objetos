import java.util.ArrayList;

public class Frota {
    
    private ArrayList<Caminhao> caminhoes;
    private ArrayList<Carro> carros;

    public Frota(){
        carros = new ArrayList<>();
        caminhoes = new ArrayList<>();

    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void adicionarCaminhao(Caminhao caminhao) {
        caminhoes.add(caminhao);
    }

    public void exibirInformacoesVeiculos() {
        for(Carro carro : carros){
            System.out.println(carro.getDescricao());
        }

        for(Caminhao caminhao : caminhoes){
            System.out.println(caminhao.getDescricao());
        }
    }
}
