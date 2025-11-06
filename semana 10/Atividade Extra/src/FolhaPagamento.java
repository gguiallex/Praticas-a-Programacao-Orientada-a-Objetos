import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Beneficiario> beneficiarios;
    
    public FolhaPagamento(){
        beneficiarios = new ArrayList<>();
    }

    public void cadastrarBeneficiario(Beneficiario ben){
        beneficiarios.add(ben);
    }

    public void gerarFolhaPagamento(){
        for(Beneficiario ben: beneficiarios){
            System.out.println(ben.toString() + "\n");
        }
    }
}
