class OfenKaputtException extends RuntimeException {
    OfenKaputtException(String message) {
        super(message);
    }

    OfenKaputtException(String message, Exception e) {
        super(message, e);
    }
}
