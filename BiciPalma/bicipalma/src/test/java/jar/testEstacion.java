package jar;

import junit.framework.Test;
import junit.framework.TestCase;


public class testEstacion extends TestCase {

    @org.junit.Test
    public void Estacion(){
        Estacion miCasa = new Estacion(3, "Mi casa", 5);
        miCasa.consultarEstacion();

    }
}