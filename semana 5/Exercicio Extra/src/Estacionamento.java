import java.util.ArrayList;

public class Estacionamento {
    private String nome;
    private ArrayList<Carro> carros;

    public Estacionamento(String nome){
        this.nome = nome;
        carros = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarCarro(String nome, String marca, String placa){
        carros.add(new Carro(nome, marca, placa));
    }

    public void removerCarro(String placa){
        for(Carro c : carros){
            if(c.getPlaca().equals(placa)){
                carros.remove(c);
            }
        }
    }

    public void imprimirCarros(){
        for(Carro c : carros){
            System.out.println("Carro:" + c.getMarca() + " " + c.getModelo() + " Placa: " + c.getPlaca());
        }
    }
}
