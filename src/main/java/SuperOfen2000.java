class SuperOfen2000 {
    static String backe(String pizza) throws OfenKaputtException {
        if (true) {
            throw new OfenKaputtException("Feuer, Rauch und Funken");
        }

        return "gebackene " + pizza;
    }
}
