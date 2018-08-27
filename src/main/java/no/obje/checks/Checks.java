package no.obje.checks;

public final class Checks {

    private Checks() {}

    public static <T> T notNull(T value) {
        if(value == null) {
            throw new IllegalArgumentException("Object cannot be null");
        }
        return value;
    }

}