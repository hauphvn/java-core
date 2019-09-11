package edu.hauphvn.thread;

public class a_ExtendThread extends Thread{
    private int count = 0;
    @Override
    public void run() {
        count++;
        System.out.println("a_ExtendThread: "+count);
    }
}
