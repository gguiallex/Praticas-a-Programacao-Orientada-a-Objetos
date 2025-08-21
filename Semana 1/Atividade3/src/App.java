import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String frase;
        String palavras[];
        String maiorPalavra = "";
        int tamanho = 0;

        System.out.print("Frase a ser analisada: ");
        frase = entrada.nextLine();

        palavras = frase.split(" ");

        for(int i = 0; i < palavras.length; i++){
            String palavraAtual = palavras[i];
            int qntVogais = 0;

            for(int j = 0; j < palavraAtual.length(); j++){
                char letra = palavraAtual.charAt(j);
                if( "AEIOUaeiou".indexOf(letra) != -1){
                    qntVogais++;
                }

                if (qntVogais > tamanho){
                    tamanho = qntVogais;
                    maiorPalavra = palavraAtual;
                }
            }
        }
        
        System.out.printf("Palavras com maior quantidade de vogais: %s\nTamanho: %d", maiorPalavra, tamanho);

        entrada.close();
    }
}
