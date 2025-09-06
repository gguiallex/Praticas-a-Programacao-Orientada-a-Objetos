import java.util.ArrayList;

public class Disciplina {
    private String codDisciplina;
    private ArrayList<Aluno> alunos;

    public Disciplina(String codDisciplina) {
        this.codDisciplina = codDisciplina;
        alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codDisciplina;
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno.getNota() >= 0 && aluno.getNota() <= 100) {
            alunos.add(aluno);
        } else {
            System.out.println("Erro ao tentar adicionar aluno: A nota deve ser entre 0 e 100");
        }
    }

    public ArrayList<Aluno> getListaAlunos() {
        return alunos;
    }

    public void ordenarDiario() {
        alunos.sort(Aluno.getComparator());
    }
}
