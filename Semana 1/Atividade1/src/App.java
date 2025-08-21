import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int codigo;
        int quantidade;
        float precoUnitario, valorBruto, desconto, totalPagar;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Digite o codigo do produto: ");
            codigo = input.nextInt();

            if(codigo < 1 || codigo > 40) {
                System.out.println("Codigo invalido! Tente novamente.");
            }

        } while (codigo < 1 || codigo > 40);

        do {
        System.out.print("Digite a quantidade do produto: ");
        quantidade = input.nextInt();
        } while (quantidade < 1);

        if(codigo >= 1 && codigo <= 10){
            precoUnitario = 10.00f;
        } else if (codigo >= 11 && codigo <= 20){
            precoUnitario = 15.00f;
        } else if (codigo >= 21 && codigo <= 30){
            precoUnitario = 20.00f;
        } else {
            precoUnitario = 25.00f;
        }

        valorBruto = precoUnitario*quantidade;

        if (valorBruto < 250.00f){
            desconto = valorBruto * 0.05f;
            totalPagar = valorBruto - desconto;
        } else if (valorBruto > 250.00f && valorBruto <= 500.00f){
            desconto = valorBruto * 0.10f;
            totalPagar = valorBruto - desconto;
        } else {
            desconto = valorBruto * 0.15f;
            totalPagar = valorBruto - desconto;
        }

        

        System.out.printf("\nPreco Unitario: R$%.2f\nValor Bruto: R$%.2f\nValor do Desconto: R$%.2f\nPreco Final: R$%.2f", precoUnitario, valorBruto, desconto, totalPagar);

        input.close();
    }
}
