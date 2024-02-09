class Bella {
    static String machPizza() {
        System.out.println("Bella: Ich belege die Pizza");
        String pizza = "margherita Pizza";

        String gebackenePizza;

        try {
            gebackenePizza = SuperOfen2000.backe(pizza);
        }
        catch (OfenKaputtException exception) {
            System.out.println("Achtung der Ofen ist kaputt!!!");

            throw new RuntimeException("Ich kann die Pizza nicht zubereiten.", exception);
        }

        String fertigePizza = gebackenePizza + " im Karton";
        System.out.println("Bella: Hier die fertige Pizza!");
        return fertigePizza;
    }
}
