import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        
        float valor;

        do {
            System.out.print("Entre com um valor positivo: ");
            valor = entrada.nextFloat();

            if (valor < 0){
                System.out.println("Erro! O valor não é POSITIVO.");
            }
        } while (valor <= 0);

        float tolerancia = 0.0001f;
        float xAnterior = valor/2.0f;
        float xAtual;
        float diferenca;

        do {
            xAtual = 0.5f * (xAnterior+valor/xAnterior);
            diferenca = Math.abs(xAtual - xAnterior);
            xAnterior = xAtual;
        } while (diferenca > tolerancia);

        System.out.printf("A raiz quadrada de %.1f é igual a %f", valor, xAtual);

        entrada.close();
    }
}
