class Andi {
    static String lieferPizza() {
        System.out.println("Andi: Ich fahre zu Bella");
        String pizza;

        pizza = Bella.machPizza();

        System.out.println("Andi: Liefere fertige Pizza aus");
        return pizza;
    }
}
