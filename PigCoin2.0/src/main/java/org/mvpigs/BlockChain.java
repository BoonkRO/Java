package org.mvpigs;

import jdk.nashorn.internal.ir.Block;

import java.util.ArrayList;

public class BlockChain {

    private ArrayList<Transaction> blockChain = new ArrayList<Transaction>();

    /* Constructor */
    public BlockChain(){

    }

    public BlockChain(ArrayList blockChain){
        this.blockChain = blockChain;
    }


    public void addOrigin(Transaction transaction){
        blockChain.add(transaction);
    }

    public void summarize(){
        for (Transaction trx: blockChain){
            System.out.println(trx.toString());
        }
    }

    public void summarize(int index){
        System.out.println(blockChain.get(index));
    }



}
