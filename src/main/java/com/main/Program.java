package com.main;

import com.topic.threads.BankAccount;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {

    public static void main(String[] args) throws InterruptedException {
         BankAccount account=new BankAccount();
        Thread deposit1= new Thread(()->account.deposit(560));
        Thread deposit2= new Thread(()->account.deposit(1000));
        Thread withdraw1= new Thread(()->account.withdraw(200));
        Thread withdraw2= new Thread(()->account.withdraw(1200));

        deposit1.start();
        deposit2.start();
        withdraw1.start();
        withdraw2.start();


//        ExecutorService service= Executors.newFixedThreadPool(4);
//        service.submit(()->account.deposit(300));
//        service.submit(()->account.withdraw(600));
//        service.submit(()->account.deposit(1000));
//        service.submit(()->account.withdraw(20));
//        service.shutdown();

    }
}
