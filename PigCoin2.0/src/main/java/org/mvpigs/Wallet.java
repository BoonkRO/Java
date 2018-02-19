package org.mvpigs;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;


public class Wallet {
    private PublicKey address;
    private PrivateKey sKey;
    private double total_input = 0d;
    private double total_output = 0d;
    private double balance = 0d;
    private ArrayList<Transaction> inputTransactions = new ArrayList<Transaction>();
    private ArrayList<Transaction> outputTransactions =  new ArrayList<Transaction>();

    /* Constructores */

    public Wallet(){

    }


    /* Encapsulación */

    public PublicKey getAddress() {
        return address;
    }

    public void setAddress(PublicKey address) {
        this.address = address;
    }


    public void setSK(PrivateKey sKey) {
        this.sKey = sKey;
    }

    public PrivateKey getsKey() {
        return sKey;
    }

    public void generateKeyPair(){
        KeyPair par = GenSig.generateKeyPair();
        setSK(par.getPrivate());
        setAddress(par.getPublic());
    }

    public double getTotal_input() {
        return total_input;
    }

    public double getTotal_output() {
        return total_output;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return "\n Wallet = " + getAddress().hashCode() + "\n Total input = "  + total_input + "\n Total output = " + total_output + "\n Balance = " + balance + "\n";
    }
}