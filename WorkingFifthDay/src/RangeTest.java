import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RangeTest {

    @Test
    public void startWithInclude() {
        MyRange range = new MyRange("[1,5]");
        assertTrue(range.startWithInclude());
    }

    @Test
    public void endWithInclude() {
        MyRange range = new MyRange("[1,5]");
        assertTrue(range.endWithInclude());
    }
    
    @Test
    public void startNumberWithInclude() {
        MyRange range = new MyRange("[1,5]");
        assertEquals(1,range.getStartNumber());
    }
    @Test
    public void startNumberWithExclude() {
        MyRange range = new MyRange("(4,5]");
        assertEquals(5,range.getStartNumber());
    }
    @Test
    public void endNumberWithInclude() {
        MyRange range = new MyRange("[1,5]");
        assertEquals(5,range.getEndNumber());
    }
    @Test
    public void endNumberWithExclude() {
        MyRange range = new MyRange("[1,5)");
        assertEquals(4,range.getEndNumber());
    }

    @Test
    public void finalTestCase() {
        MyRange range = new MyRange("[1,5]");
        assertEquals("1,2,3,4,5", range.getResult());
    }

    @Test
    public void finalTestCase2() {
        MyRange range = new MyRange("[1,5)");
        assertEquals("1,2,3,4", range.getResult());
    }

    @Test
    public void finalTestCase3() {
        MyRange range = new MyRange("(1,5)");
        assertEquals("2,3,4", range.getResult());
    }

    @Test
    public void finalTestCase4() {
        MyRange range = new MyRange("(1,5]");
        assertEquals("2,3,4,5", range.getResult());
    }

    @Test
    public void finalTestCase5() {
        MyRange range = new MyRange("[5,1)");
        assertEquals("", range.getResult());
    }
    @Test
    public void finalTestCase6() {
        MyRange range = new MyRange("[5,5]");
        assertEquals("5", range.getResult());
    }

}
