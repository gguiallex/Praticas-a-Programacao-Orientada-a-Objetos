public abstract class Beneficiario {
    private String cpf, nome;

    public Beneficiario(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract double valorAposentadoria();

    @Override
    public String toString(){
        return "Nome: " + nome + "\nCpf: " + cpf;
    }
}
