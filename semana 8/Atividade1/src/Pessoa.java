abstract class Pessoa {
    private String nome;
    private String email;
    private String endereco;
    
    public Pessoa(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public abstract String getIdentificador();

    @Override
    public String toString(){    
        return
            "Nome: " + nome +
            "\nEmail: " + email +
            "\nEndereço: " + endereco;
    }
}