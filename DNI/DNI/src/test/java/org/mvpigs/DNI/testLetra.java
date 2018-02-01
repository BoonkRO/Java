package test.java.org.mvpigs.DNI;

import junit.framework.TestCase;
import main.java.org.mvpigs.DNI.letraDNI;


public class testLetraDNI extends TestCase{

    @Test
    public void testLetra() {
        letrasDNI nuevoDNI = new letrasDNI("47455398");
        assertEquals('G', nuevoDNI.getLetra());

    }


}