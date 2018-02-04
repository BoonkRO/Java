package jar;

import junit.framework.TestCase;
import org.junit.Test;
import junit.framework.Assert;


public class testRectangulo extends TestCase{
    
    @Test
    public void testArea(){
        rectangulo saberArea = new rectangulo(5, 4);
        assertEquals(20.0, saberArea.area());
    }

}