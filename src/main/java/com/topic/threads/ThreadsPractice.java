package com.topic.threads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
 */
public class ThreadsPractice {

   private static final int number=20;

//    public static void main(String[] args) {
//
//        ExecutorService service= Executors.newFixedThreadPool(2);
//        service.submit(ThreadsPractice::primeNum);
//        service.submit(ThreadsPractice::OddNumbers);
//        service.shutdown();
//
//       // primeNum();
//
//    }



   //find odd numbers
    public static  void evenNumbers(){

        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.println("Number is even : " +i);
            }
        }

    }

    public static synchronized  void OddNumbers(){

        for(int i=2;i<=number;i++){
            if(!(i%2==0)){
                System.out.println("Number is odd : " +i);
            }
        }


    }

    //find prime numbers
    public static synchronized void primeNum(){

        for(int i=2;i<=number;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println("Number is prime :" + i);
            }
        }
    }


    //fist approach
    public static void oddEven(){
        Thread evenThread=new Thread(()->{
            for(int i=1;i<=number;i++){
                if(i%2==0){
                    System.out.println("Number is even : " +i);
                }
            }});


        Thread oddThread=new Thread(()->{
            for(int i=1;i<=number;i++){
                if(!(i%2==0)){
                    System.out.println("Number is odd : " +i);
                }
            }});

        evenThread.start();
        oddThread.start();
    }

}
