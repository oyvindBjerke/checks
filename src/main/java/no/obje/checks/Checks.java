package no.obje.checks;

import java.util.List;

public final class Checks {

    private Checks() {}

    public static <T> T notNull(T value) {
        if(value == null) {
            throw new IllegalArgumentException("Object cannot be null");
        }
        return value;
    }

    public static <T> List<T> notEmpty(List<T> list) {
        notNull(list);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        return list;
    }

}