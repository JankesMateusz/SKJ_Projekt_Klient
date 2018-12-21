package tools;

import org.junit.Test;

import static org.junit.Assert.*;

public class IpValidatorTest {

    private IpValidator ipValidator = new IpValidator();

    @Test
    public void withCorrectIP(){

        String ip = "127.168.1.1";
        assertTrue(ipValidator.validate(ip));
    }

    @Test
    public void withWordInsteadOfNumbers(){

        String ip = "to_jest_blad";
        assertFalse(ipValidator.validate(ip));
    }

    @Test
    public void withNoEnoughDots(){

        String ip = "127.123.1";
        assertFalse(ipValidator.validate(ip));
    }

    @Test
    public void withTooManyDots(){

        String ip = "127.123.1.10.1";
        assertFalse(ipValidator.validate(ip));
    }

    @Test
    public void withCharInsteadOfNumber(){

        String ip = "127.m.1.1";
        assertFalse(ipValidator.validate(ip));
    }

    @Test
    public void withZeroesOnly(){
        String ip = "0.0.0.0";
        assertFalse(ipValidator.validate(ip));
    }

    @Test
     public void emptyString(){
        String ip = "";
        assertFalse(ipValidator.validate(ip));
     }

     @Test
     public void spacesInsteadOfDots(){
         String ip = "127 31 1 1";
         assertFalse(ipValidator.validate(ip));
     }
}