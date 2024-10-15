class Bella {
    static String machPizza() {
        System.out.println("Bella: Ich belege die Pizza");
        String pizza = "margherita Pizza";

        String gebackenePizza;

        gebackenePizza = SuperOfen2000.backe(pizza);

        String fertigePizza = gebackenePizza + " im Karton";
        System.out.println("Bella: Hier die fertige Pizza!");
        return fertigePizza;
    }
}
