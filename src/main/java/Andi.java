class Andi {
    static String lieferPizza() {
        System.out.println("Andi: Ich fahre zu Toni");
        String pizza;

        try {
             pizza = Bella.machPizza();
        }
        catch (OfenKaputtException exception) {
            pizza = "Pizza vom anderen Restaurant";

            throw new RuntimeException("Tut uns leider unser Ofen ist kaputt.", exception);
        }

        System.out.println("Andi: Ich schneide die Pizza");
        return pizza;
    }
}
