package org.mvpigs;

import java.security.PublicKey;

public class Transaction {

    private String hash = null;
    private String prev_hash = null;
    private PublicKey pKey_sender;
    private PublicKey pKey_recipient;
    private int pigcoins = 0;
    private String message = null;
    private byte[] signature;

    public Transaction(){

    }

    public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, int pigcoins, String message){
        this.hash = hash;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigcoins = pigcoins;
        this.message = message;
    }

    /* Encapsulacion */

    @Override
    public String toString() {
        return "\n hash = " + hash + "\n prev_hash = " + prev_hash + "\n pKey_sender = " + pKey_sender.hashCode() + "\n pKey_recipient = " + pKey_recipient.hashCode() + "\n pigcoins = " + pigcoins + "\n message = " + message + "\n";
    }

    public String getHash() {
        return hash;
    }

    public String getPrev_hash() {
        return prev_hash;
    }

    public PublicKey getpKey_sender() {
        return pKey_sender;
    }


    public PublicKey getpKey_recipient() {
        return pKey_recipient;
    }

    public int getPigcoins() {
        return pigcoins;
    }

    public void setPigcoins(int pigcoins) {
        this.pigcoins = pigcoins;
    }

    public String getMessage() {
        return message;
    }

    public byte[] getSignature(){
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }
}