import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        OfenKaputtException exception = new OfenKaputtException("FEHLERMELDUNG");

        System.out.println(exception.getMessage());

//        throw exception;

        Optional<String> optional = Optional.of("Product");

        String value = optional.orElseThrow();
        System.out.println(value);
    }
}
