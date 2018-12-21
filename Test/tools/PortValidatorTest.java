package tools;

import org.junit.Test;

import static org.junit.Assert.*;

public class PortValidatorTest {

    private PortValidator validator = new PortValidator();

    @Test
    public void correctPort() {
        String port = "10111";
        assertTrue(validator.validate(port));
    }

    @Test
    public void portTooShort(){
        String port = "4011";
        assertFalse(validator.validate(port));
    }

    @Test
    public void portStartsWithZero(){
        String port = "00111";
        assertFalse(validator.validate(port));
    }

    @Test
    public void emptyString(){
        String port = "";
        assertFalse(validator.validate(port));
    }

    @Test
    public void portWithSpaces(){
        String port = "0 01 11";
        assertFalse(validator.validate(port));
    }
}