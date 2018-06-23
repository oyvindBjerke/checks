package no.bjerke.checks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChecksTest {

    @Test
    void should_throw_exception_with_expected_message_if_object_is_null() {
        final var exception = assertThrows(IllegalArgumentException.class, () -> Checks.notNull(null));
        assertEquals("Object cannot be null", exception.getMessage());
    }

    @Test
    void non_null_value_should_return_expected_value() {
        final var result = Checks.notNull("input");
        assertEquals("input", result);
    }

}