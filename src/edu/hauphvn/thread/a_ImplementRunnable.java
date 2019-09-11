package edu.hauphvn.thread;

public class a_ImplementRunnable implements Runnable {
    private int count = 0;
    @Override
    public void run() {
        count++;
        System.out.println("a_ImplementRunnable "+ count);

    }
}
