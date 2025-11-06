public class ForcasArmadas extends Beneficiario implements ContribuiniteINSS {
    
    private double ultimoSalario;

    public ForcasArmadas(String cpf, String nome, double ultimoSalario){
        super(cpf, nome);
        this.ultimoSalario = ultimoSalario;
    }

    @Override
    public double valorAposentadoria(){
        return (ultimoSalario * 90) / 100;
    }

    @Override
    public double calcularContribuicaoINSS(){
        return (ultimoSalario * 11) / 100;
    }

    @Override
    public String toString(){
        return super.toString() + "\nAposentadoria: " + String.format("%.2f", valorAposentadoria()) + "\nContribuicao INSS: " + String.format("%.2f", calcularContribuicaoINSS());
    }
}
