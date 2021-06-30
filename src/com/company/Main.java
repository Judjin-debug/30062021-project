package com.company;
//Thread test for extends Thread
public class Main {

    public static void main(String[] args) {
        try {
            NewThread t1 = new NewThread();
            NewThread t2 = new NewThread();
            t1.setName("Thread 1");
            t2.setName("Thread 2");
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            System.out.println("Threads completed!");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
