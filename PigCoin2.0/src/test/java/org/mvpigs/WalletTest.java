package org.mvpigs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import

public class WalletTest {

    public Wallet wallet1 = new Wallet();
    public Wallet wallet2 = new Wallet();
    public Wallet origin = new Wallet();
    public BlockChain bChain = new BlockChain();
    public ArrayList<Transaction> blockchain = new ArrayList<Transaction>();
    public Transaction trx;

    @Before
    public void testCrearWallets() {
        wallet1 = new Wallet();
        wallet1.generateKeyPair();
        wallet2 = new Wallet();
        wallet2.generateKeyPair();
        origin = new Wallet();
        origin.generateKeyPair();
    }


    @Test
    public void testCrearWallet1() {
        Wallet wallet1 = new Wallet();
        KeyPair pair = GenSig.generateKeyPair();
        wallet1.setSK(pair.getPrivate());
        wallet1.setAddress(pair.getPublic());
        assertEquals(wallet1.getAddress().hashCode(), pair.getPublic().hashCode());
    }

    @Test
    public void testCrearWallet2() {
        Wallet wallet_2 = new Wallet();
        wallet_2.generateKeyPair();

    }

    @Test
    public void verWallets() {

        assertEquals(wallet1.toString(), "\nWallet = " + wallet1.getAddress().hashCode() +
                "\nTotal input = " + wallet1.getTotal_input() +
                "\nTotal output = " + wallet1.getTotal_output() +
                "\nBalance = " + wallet1.getBalance() + "\n");

        assertEquals(wallet2.toString(), "\nWallet = " + wallet2.getAddress().hashCode() +
                "\nTotal input = " + wallet2.getTotal_input() +
                "\nTotal output = " + wallet2.getTotal_output() +
                "\nBalance = " + wallet2.getBalance() + "\n");
    }
}