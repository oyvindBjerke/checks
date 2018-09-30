package no.obje.checks;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

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

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_expected_exception_if_list_is_null() {
        Checks.notEmpty(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_expected_exception_if_list_is_empty() {
        Checks.notEmpty(Collections.emptyList());
    }

    @Test
    public void should_return_list_if_list_is_not_empty() {
        List<String> list = Collections.singletonList("test");
        List<String> result = Checks.notEmpty(list);
        assertEquals(list, result);
    }
}