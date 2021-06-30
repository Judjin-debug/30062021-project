package com.company;

public class NewThreadR implements Runnable {

    Thread th;

    public NewThreadR () {
        th = new Thread(this);
    };

    public void run () {
        int count = 0;
        while (count < 100) {
            count++;
            System.out.println(count);
        }
    };

    void start() {
        th.start();
    };
};
