class Andi {
    public static String lieferPizza() throws OfenKaputtException{
        System.out.println("Andi: Ich fahre zu Bella");
        String pizza;

//        try {
            pizza = Bella.machPizza();
//        }
//        catch (OfenKaputtException exception) {
//            pizza = "Pizza von anderem Restaurant";
//        }

        System.out.println("Andi: Liefere fertige Pizza aus");
        return pizza;
    }
}
