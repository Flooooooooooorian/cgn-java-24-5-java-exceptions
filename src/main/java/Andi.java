class Andi {
    static String lieferPizza() {
        System.out.println("Andi: Ich fahre zu Bella");
        String pizza;

        try {
            pizza = Bella.machPizza();
        }
        catch (RuntimeException exception) {
            System.out.println("Andi: Ich fahre zur anderen Pizzeria");
            pizza = "margherita Pizza von anderer Pizzeria";
        }

        System.out.println("Andi: Ich schneide die Pizza");
        return pizza;
    }
}
