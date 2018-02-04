package org.mvpigs.DNI;

import junit.framework.TestCase;
import org.junit.Test;


public class testLetra extends TestCase {

    @Test
    public void testLetra1() {

        letraDNI hhh = new letraDNI("47455398");
        assertEquals('G', hhh.getLetra());
    }
}