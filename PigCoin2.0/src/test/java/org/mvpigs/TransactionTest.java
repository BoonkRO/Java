package org.mvpigs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TransactionTest {

    @Test
    public void testTransaccion() {
        Transaction transaccion1 = new Transaction();
        assertEquals(null, transaccion1.getHash());
        assertEquals(null, transaccion1.getPrev_hash());
        assertEquals(0, transaccion1.getPigcoins());
        assertEquals(null, transaccion1.getMessage());
    }
}