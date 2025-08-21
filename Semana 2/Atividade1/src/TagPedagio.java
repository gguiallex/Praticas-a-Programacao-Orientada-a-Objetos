public class TagPedagio {
    String placa;
    double saldo;

    TagPedagio (String placa, double saldo){
        this.placa = placa;
        this.saldo = saldo;
    }

    TagPedagio (String placa) {
        this.placa = placa;
        saldo = 10.00;
    }

    void atualizarSaldo (double novoSaldo) {
        saldo += novoSaldo;
    }

    void passarNoPedagio (double descontarSaldo) {
        if (saldo < descontarSaldo){
            System.out.printf("Passagem bloqueada para %s. Saldo insuficiente!\n", placa);
        } else {
            saldo -= descontarSaldo;
            System.out.printf("Passagem liberada para %s. Novo saldo: R$%.2f.\n", placa, saldo);
        }
    }
}
