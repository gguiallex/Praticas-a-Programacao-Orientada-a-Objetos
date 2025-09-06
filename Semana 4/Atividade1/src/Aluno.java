import java.util.Comparator;

public class Aluno {
    private String nome;
    private int nota;
    private int faltas;

    public Aluno(String nome, int nota, int faltas){
        this.nome = nome;
        this.nota = nota;
        this.faltas = faltas;
    }

    public String getNome() {
        return nome;
    }

    public int getFaltas() {
        return faltas;
    }

    public int getNota() {
        return nota;
    }

    public String getSituacao(){
        if(nota >= 60 && faltas < 19){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static Comparator<Aluno> getComparator() {
        Comparator<Aluno> comparador = new Comparator<>() {
            @Override
            public int compare(Aluno aluno1, Aluno aluno2) {
                return aluno2.getNota() - aluno1.getNota();
            }
        };
        return comparador;
    }
}
