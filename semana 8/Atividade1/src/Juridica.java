public class Juridica extends Pessoa {
    private String cnpj;
    private int inscEstadual;

    public Juridica(String nome, String email, String endereco, String cnpj, int inscEstadual){
        super(nome, email, endereco);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
    };

    public String getIdentificador(){
        return cnpj;
    };

    @Override
    public String toString(){
        return "=======Pessoa Jurídica=======\n" +
            super.toString() +
            "\nCNPJ: " + cnpj +
            "\nInscrição Estadual: " + inscEstadual;
    };
}
