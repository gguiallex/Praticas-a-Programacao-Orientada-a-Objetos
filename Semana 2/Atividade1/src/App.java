public class App {
    public static void main(String[] args) throws Exception {
        TagPedagio carro1 = new TagPedagio("ABC1D23");
        carro1.passarNoPedagio(15.00);

        TagPedagio carro2 = new TagPedagio("EFG4H56", 20.00);
        carro2.atualizarSaldo(15.00);
        carro2.passarNoPedagio(23.00);
    }
}
