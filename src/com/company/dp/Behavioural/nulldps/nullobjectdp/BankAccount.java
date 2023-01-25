package com.company.dp.Behavioural.nulldps.nullobjectdp;

public class BankAccount {
    private ILog log;
    private int balance;
    public BankAccount(ILog log){
        this.log=log;
    }
    public void  deposite(int amount){
        balance+=amount;
        log.info("deposeted"+amount);

    }

}
