package org.mvpigs;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestRomanNumbers extends TestCase {

    @Test
    public static void testNumeroRomano(){

        //Detectar
        assertEquals(10, RomanNumbers.romanToDecimal("X"));

        //
        assertEquals(521, RomanNumbers.romanToDecimal("DXXI"));
        assertEquals(1182, RomanNumbers.romanToDecimal("MCLXXXII"));

        //Campo vacío
        assertEquals(-1, RomanNumbers.romanToDecimal(""));

        //Restando
        assertEquals(43, RomanNumbers.romanToDecimal("XLIII"));
        assertEquals(-1, RomanNumbers.romanToDecimal("MMMMCCCXII"));
    }


}
