public class App {
    public static void main(String[] args) throws Exception {
        ClasseGenerica<String> objString = new ClasseGenerica<>("Gato", "Cachorro", "Mariposa");
        ClasseGenerica<Double> objDouble = new ClasseGenerica<>(1.1, 2.2, 3.3);

        objString.setAtributo2("Pavao");

        System.out.println("Primeira classe generica:");
        System.out.println("atributo 1 = " + objString.getAtributo1());
        System.out.println("atributo 2 = " + objString.getAtributo2());
        System.out.println("atributo 3 = " + objString.getAtributo3());

        System.out.println("Segunda classe generica:");
        System.out.println("atributo 1 = " + objDouble.getAtributo1());
        System.out.println("atributo 2 = " + objDouble.getAtributo2());
        System.out.println("atributo 3 = " + objDouble.getAtributo3());
    }
}
