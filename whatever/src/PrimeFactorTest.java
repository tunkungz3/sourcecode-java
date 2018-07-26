import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeFactorTest {

    @Test
    public void primeFactorOfTwo() {
        PrimeFactor pf = new PrimeFactor();
        String result = pf.of(2);
        assertEquals("2", result);
    }

    @Test
    public void primeFactorOfFour() {
        PrimeFactor pf = new PrimeFactor();
        String result = pf.of(4);
        assertEquals("22", result);
    }

    @Test
    public void primeFactorOfSix() {
        PrimeFactor pf = new PrimeFactor();
        String result = pf.of(6);
        assertEquals("23", result);
    }

    @Test
    public void primeFactorOfEight() {
        PrimeFactor pf = new PrimeFactor();
        String result = pf.of(8);
        assertEquals("222", result);
    }
    @Test
    public void primeFactorOfNine() {
        PrimeFactor pf = new PrimeFactor();
        String result = pf.of(9);
        assertEquals("33", result);
    }
    @Test
    public void primeFactorOfTen() {
        PrimeFactor pf = new PrimeFactor();
        String result = pf.of(10);
        assertEquals("25", result);
    }
}
