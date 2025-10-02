import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> pessoas;
    
    public Agenda() {
        pessoas = new ArrayList<>();
    }

    public void adicionarContatos(Pessoa pessoa){
        pessoas.add(pessoa);
        System.out.println("Contato adicionado com sucesso!\n");
    }

    public boolean removerContato(String id){
        for(Pessoa p : pessoas){
            if(p.getIdentificador().equals(id)){
                pessoas.remove(p);
                System.out.println("Pessoa com o identificador " + id + " removida com sucesso!\n");
                return true;
            }
        }
        System.out.println("Pessoa com o identificador "+ id + " não foi encontrada.\n");
        return false;
    }

    public void imprimirDados(){
        for(Pessoa p : pessoas){
            System.out.println(p.toString());
        }
        System.out.print("\n");
    }
}
