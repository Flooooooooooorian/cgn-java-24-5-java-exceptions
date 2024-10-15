class Bella {
    static String machPizza() throws OfenKaputtException {
        System.out.println("Bella: Ich belege die Pizza");
        String pizza = "margherita Pizza";

        String gebackenePizza;

//        try {
            gebackenePizza = SuperOfen2000.backe(pizza);
//        }
//        catch (OfenKaputtException exception) {
//            System.out.println("ACHTUNG OFEN IST KAPUTT");
//            System.out.println(exception.getMessage());
//
//            gebackenePizza = "In Pfanne gebratene " + pizza;
//        }

        String fertigePizza = gebackenePizza + " im Karton";
        System.out.println("Bella: Hier die fertige Pizza!");
        return fertigePizza;
    }
}
