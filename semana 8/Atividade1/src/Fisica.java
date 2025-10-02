public class Fisica extends Pessoa{
    private String cpf;
    private String estadoCivil;

    public Fisica(String nome, String email, String endereco, String cpf, String estadoCivil){
        super(nome, email, endereco);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    };

    public String getIdentificador(){
        return cpf;
    };

    @Override
    public String toString(){
        return "=======Pessoa Física=======\n" +
            super.toString() +
            "\nCPF: " + cpf +
            "\nEstado Civil: " + estadoCivil;
    };
}
