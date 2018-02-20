package org.mvpigs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.mvpigs.*;

public class TransactionTest extends BlockChainTest{

    public void testCrearTransaction(){
        cartera1 = new Wallet();
        cartera1.generateKeyPair();
        cartera2 = new Wallet();
        cartera2.generateKeyPair();
        trx = new Transaction("hash_1", "0", cartera1.getAddress(), cartera2.getAddress(), 20, "a flying pig!");
    }

    @Test
    public void testVerTransaccion(){
        assertEquals(trx.toString(), "\nhash = "+trx.getHash()+
                "\n prev_hash = "+trx.getPrev_hash()+
                "\n pKey_sender = "+trx.getpKey_sender().hashCode()+
                "\n pKey_recipient = "+trx.getpKey_recipient().hashCode()+
                "\n pigcoins = "+trx.getPigcoins()+
                "\n message = "+trx.getMessage());
    }

}