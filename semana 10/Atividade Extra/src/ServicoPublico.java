public class ServicoPublico extends Beneficiario implements ContribuiniteINSS {
    private double mediaSalarial;

    ServicoPublico(String cpf, String nome, double mediaSalarial){
        super(cpf, nome);
        this.mediaSalarial = mediaSalarial;
    }

    @Override
    public double valorAposentadoria(){
        return (mediaSalarial * 80) / 100;
    }

    @Override
    public double calcularContribuicaoINSS() {
        return (mediaSalarial * 14) / 100;
    }

    @Override
    public String toString(){
        return super.toString() + "\nAposentadoria: " + String.format("%.2f", valorAposentadoria()) + "\nContribuicao: " + String.format("%.2f", calcularContribuicaoINSS());
    }
}
