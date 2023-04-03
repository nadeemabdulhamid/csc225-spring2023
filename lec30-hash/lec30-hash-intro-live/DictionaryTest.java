

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DictionaryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DictionaryTest {
  
    @Test
    public void testContains() {
        /*
        char c = 'a';
        System.out.println(c);
        int x = c;
        System.out.println(x);
        */
        
        Dictionary d = new Dictionary();
        
        d.add("pam");
        d.add("computer");
        d.add("mask");
        d.add("phone");
        d.add("banana");
        d.add("pen");
        d.add("book");
        d.add("map");
        d.add("hello");
        //d.add("22");
        //d.add("(7");
        
        assertEquals( true, d.contains("computer") );
        assertEquals( true, d.contains("phone") );
        assertEquals( true, d.contains("banana") );
        assertEquals( true, d.contains("hello") );
        assertEquals( true, d.contains("book") );
        assertEquals( false, d.contains("desk") );
        assertEquals( true, d.contains("pen") );
        assertEquals( true, d.contains("mask") );
        assertEquals( true, d.contains("map") );
        assertEquals( true, d.contains("pam") );
        assertEquals( false, d.contains("amp") );
        
        //assertEquals( true, d.contains("22") );
        //assertEquals( true, d.contains("(7") );
    }
    
}
