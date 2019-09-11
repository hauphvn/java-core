package edu.hauphvn.thread;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Message from Second Thread: "+ i);
            try {
                System.out.println("Second Thread is sleeping");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error of Second Thread: "+ e.getMessage());
            }
        }
    }
}
