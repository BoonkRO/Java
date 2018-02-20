package org.mvpigs;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import org.mvpigs.*;
import java.security.KeyPair;
import java.util.ArrayList;


public class WalletTest {

    public Wallet cartera1 = new Wallet();
    public Wallet cartera2 = new Wallet();
    public Wallet origin = new Wallet();
    public BlockChain bChain = new BlockChain();
    public ArrayList<Transaction> blockchain = new ArrayList<Transaction>();
    public Transaction trx;

    @Before
    public void testCrearWallets() {
        cartera1 = new Wallet();
        cartera1.generateKeyPair();
        cartera2 = new Wallet();
        cartera2.generateKeyPair();
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

        assertEquals(cartera1.toString(), "\nWallet = " + cartera1.getAddress().hashCode() +
                "\nTotal input = " + cartera1.getTotal_input() +
                "\nTotal output = " + cartera1.getTotal_output() +
                "\nBalance = " + cartera1.getBalance() + "\n");

        assertEquals(cartera2.toString(), "\nWallet = " + cartera2.getAddress().hashCode() +
                "\nTotal input = " + cartera2.getTotal_input() +
                "\nTotal output = " + cartera2.getTotal_output() +
                "\nBalance = " + cartera2.getBalance() + "\n");
    }
}