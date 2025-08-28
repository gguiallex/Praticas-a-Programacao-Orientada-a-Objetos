import java.util.Scanner;

public class Prova {
    Scanner entrada = new Scanner(System.in);
        Questao questoes[];

    Prova() {
        questoes = new Questao[5];
        for(int i = 0; i < 5; i++){
        questoes[i] = new Questao();
        }
    }

    public void aplicar() {
        for(int i = 0; i < questoes.length; i++){
        int tentativa = 1;
        boolean acertou = false;
        questoes[i].exibirEnunciado();

        while (!acertou && tentativa <= 2) {
            int resposta = entrada.nextInt();

            if (questoes[i].verificarResposta(resposta)) {
                acertou = true;
                System.out.printf("Você tentou %d vez(es) e acertou a questão.\n", tentativa);
            } else if (tentativa == 1) {
                System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
            }
            tentativa++;
        }

        if (!acertou)
            System.out.println("Você tentou 2 vezes e errou a questão.");
    }
    }
}
