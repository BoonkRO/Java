package jar;

import junit.framework.TestCase;
import org.junit.Test;


public class testCirculo extends TestCase{

    circulo pruebaRadio = new circulo(Math.PI*(2*2));

    @Test
    public void testRadio(){
        assertEquals(Math.PI*(2*2), pruebaRadio);
    }

    @Test
    public void testasasas(){
        assertEquals(1, 1);
    }
}