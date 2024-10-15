class Florian {
    public static void main(String[] args) {
        System.out.println("Florian: Ich will eine Pizza");
        String pizza;
        try {
            pizza = Andi.lieferPizza();
        }
        catch (OfenKaputtException exception) {
            pizza = "die Reste von gestern";
        }
        System.out.println("Florian: Ich esse " + pizza);
        System.out.println("Florian: Ich bin satt, jetzt arbeite ich weiter...");
    }
}
