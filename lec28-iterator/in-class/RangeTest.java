

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RangeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RangeTest
{
    @Test
    public void testRange() {
        Object r1 = new Range(10);
        Object r2 = new Range(0, 10, 1);
        
        assertEquals(true,  r1.equals(r1));
        assertEquals(true,  r1.equals(r2));
        assertEquals(false,  r1.equals("hello"));
        
    }
}
