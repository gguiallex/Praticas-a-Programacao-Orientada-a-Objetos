public class IniciativaPrivada extends Beneficiario {
    private int percentual;
    private static final double limite_INSS = 7507.49;

    IniciativaPrivada(String cpf, String nome, int percentual){
        super(cpf, nome);
        this.percentual = percentual;
    }

    @Override
    public double valorAposentadoria(){
        return (percentual / 100.0) * limite_INSS;
    }

    @Override
    public String toString(){
        return super.toString() + "\nAposentadoria: " + String.format("%.2f", valorAposentadoria());
    }
}
