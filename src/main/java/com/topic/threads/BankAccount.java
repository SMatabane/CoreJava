package com.topic.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {


    private double balance;
    private Lock lock; //

    public BankAccount(){
        lock=new ReentrantLock();
        balance=0.0;

    }

    //deposit money
    public synchronized void  deposit(double amount){
       lock.lock();
        try {
            balance+=amount;
            System.out.println("Deposited : "+amount);
            System.out.println("New Balance : "+balance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }

    }

    //withdrawals
    public synchronized void withdraw(double amount) {
       lock.lock();
        try {
            if (balance > amount) {
                balance -= amount;
                System.out.println("Withdrawn : " + amount);
            } else {
                System.out.println("Declined  : INSUFFICIENT AMOUNT");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }

    }


}
