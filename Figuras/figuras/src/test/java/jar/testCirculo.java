package jar;

import junit.framework.TestCase;
import org.junit.Test;


public class testCirculo extends TestCase{

    circulo pruebaRadio = new circulo(2);
    circulo pruebaArea = new circulo("circulo", 2);

    @Test
    public void testArea(){
        assertEquals(Math.PI * 4, pruebaArea.area());
    }


}