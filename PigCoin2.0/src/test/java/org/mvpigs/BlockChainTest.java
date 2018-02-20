package org.mvpigs;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


public class BlockChainTest extends WalletTest {

    @Before
    public void testCrearBlockChain(){
        bChain= new BlockChain();
        trx = new Transaction("hash_1", "0", origin.getAddress(), cartera1.getAddress(), 20, "bacon eggs");
        bChain.addOrigin(trx);
        trx = new Transaction("hash_2", "1", origin.getAddress(), cartera2.getAddress(), 10, "spam spam spam");
        bChain.addOrigin(trx);
        trx = new Transaction("hash_3", "hash_1", cartera1.getAddress(), cartera2.getAddress(), 20, "a flying pig!");
        bChain.addOrigin(trx);
    }

    @Test
    public void testSummarize(){
        int i = 0;
        for (Transaction trx: blockchain) {
            assertEquals("hash_"+i, trx.getHash());
            i++;
        }
    }

}
