import java.util.Random;

public class Questao {
    private static int totalQuestoes = 0; 
    Random random;
    int num1, num2, idQuestao, resultado;

    Questao(){
        random = new Random();
        num1 = random.nextInt(0, 10);
        num2 = random.nextInt(0, 10);
        totalQuestoes++;
        idQuestao = totalQuestoes;
    }

    public int consultarId(){
        return idQuestao;
    }

    public void exibirEnunciado(){
        System.out.printf("Questão %d: Quanto é %d * %d?\n",idQuestao, num1, num2);
    }

    public boolean verificarResposta(int resposta){
        resultado = num1 * num2;
        if(resposta == resultado){
            return true;
        }
        return false;
    }
}
