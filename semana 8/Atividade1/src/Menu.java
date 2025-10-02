import java.util.Scanner;

public class Menu {
    private Agenda agenda;
    private Scanner entrada;
    public Menu(){
        entrada = new Scanner(System.in);
        agenda = new Agenda();
    }

    public void cadastrarPessoaFisica(){
        System.out.println("===Cadastrando pessoa física===");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Email: ");
        String email = entrada.nextLine();
        System.out.print("Endereço: ");
        String endereco = entrada.nextLine();
        System.out.print("CPF: ");
        String cpf = entrada.nextLine();
        System.out.print("Estado Civil: ");
        String estadoCivil = entrada.nextLine();

        Fisica pessoa = new Fisica(nome, email, endereco, cpf, estadoCivil);
        agenda.adicionarContatos(pessoa);
    }

        public void cadastrarPessoaJuridica(){
        System.out.println("===Cadastrando pessoa jurídica===");
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Email: ");
        String email = entrada.nextLine();
        System.out.print("Endereço: ");
        String endereco = entrada.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = entrada.nextLine();
        System.out.print("Inscrição Estadual: ");
        int inscEstadual = entrada.nextInt();
        entrada.nextLine();

        Juridica pessoa = new Juridica(nome, email, endereco, cnpj, inscEstadual);
        agenda.adicionarContatos(pessoa);
    }

    public void imprimirDadosAgenda(){
        agenda.imprimirDados();
    }

    public void removerContato(){
        System.out.print("Insira o identificador(CPF/CNPJ) da pessoa que deseja remover: ");
        agenda.removerContato(entrada.nextLine());
    }

    public void imprimirMenu(){
        System.out.print("=======Menu de Opções=======\n" + 
        "1 - Cadastrar uma pessoa física\n" + 
        "2 - Cadastrar uma pessoa jurídica\n" +
        "3 - Remover um contato\n" +
        "4 - Imprimir dados da agenda\n" +
        "5 - Sair\n" +
        "Escolha uma opção: ");
    };

    public void iniciar(){
        int opcao = 0;
        do{
            imprimirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica();
                    break;
                case 2:
                    cadastrarPessoaJuridica();
                    break;
                case 3:
                    removerContato();
                    break;
                case 4:
                    imprimirDadosAgenda();
                    break;
                case 5: 
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    break;
            }
        } while (opcao != 5);
        entrada.close();
    }
}
