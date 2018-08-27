package no.obje.checks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChecksTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_expected_exception_if_object_is_null() {
        Checks.notNull(null);
    }

    @Test
    public void non_null_value_should_return_expected_value() {
        final String result = Checks.notNull("input");
        assertEquals("input", result);
    }

}