import java.util.Scanner;
import java.util.ArrayList;

public class Sig {
    Scanner entrada = new Scanner(System.in);
    private int opcao;
    private ArrayList<Disciplina> disciplinas;

    public Sig() {
        disciplinas = new ArrayList<>();
        executar();
    }

    public void executar() {
        do {
            exibirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            executarOpcao(opcao);
        } while (opcao != 4);
    }

    public boolean adicionarAluno(String codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                System.out.print("Digite o nome do aluno: ");
                String nome = entrada.nextLine();
                System.out.print("Digite a nota do aluno: ");
                int nota = entrada.nextInt();
                System.out.print("Digite a quantidade de faltas do aluno: ");
                int faltas = entrada.nextInt();
                entrada.nextLine();
                d.adicionarAluno(new Aluno(nome, nota, faltas));
                System.out.println("Aluno cadastrado!");
                return true;
            }
        }
        System.out.println("Disciplina nao encontrada...");
        return false;
    }

    public boolean imprimirDiario(String codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                d.ordenarDiario();
                System.out.println("\nDisciplina: " + d.getCodigo());
                System.out.printf("%-10s %-12s %-8s %-10s %n", "Nome", "Nota", "Faltas", "Situacao");
                for (Aluno a : d.getListaAlunos()) {
                    System.out.printf("%-10s %-12s %-8s %-10s %n", a.getNome(), a.getNota(), a.getFaltas(),a.getSituacao());
                }
                return true;
            }
        }
        System.out.println("Disciplina não encontrada...");
        return false;
    }

    public void executarOpcao(int opcao) {
        String codDisciplina;
        switch (opcao) {
            case 1:
                System.out.print("Digite o código da disciplina: ");
                codDisciplina = entrada.nextLine();
                disciplinas.add(new Disciplina(codDisciplina));
                break;
            case 2:
                System.out.print("Digite o código da disciplina: ");
                codDisciplina = entrada.nextLine();
                adicionarAluno(codDisciplina);
                break;
            case 3:
                System.out.print("Digite o código da disciplina: ");
                codDisciplina = entrada.nextLine();
                imprimirDiario(codDisciplina);
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
            System.out.println("Opção inválida!");
        }
    }

    public void exibirMenu() {
        System.out.println("### MENU ###");
        System.out.println("1. Cadastrar disciplina");
        System.out.println("2. Cadastrar dados de aluno em disciplina");
        System.out.println("3. Mostrar diario de disciplina");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opcao: ");
    }

}
