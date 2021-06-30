package com.company;
//thread test for implements Runnable
public class ThreadsTest {

    public static void main(String[] args) {
        NewThreadR t1 = new NewThreadR();
        NewThreadR t2 = new NewThreadR();
        t1.start();
        t2.start();
        //if there is no thread created by the constructor, the following code block is used:
        //NewThreadR t1 = new NewThreadR();
        //new Thread(t1).start();
    }
}
