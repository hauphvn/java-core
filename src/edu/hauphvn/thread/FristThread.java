package edu.hauphvn.thread;

public class FristThread implements  Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10;i++){
            System.out.println("Message from First Thread: "+ i);
            try {
                System.out.println("First Thread is sleeping");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception from Thread 1: "+ e.getMessage());
            }
        }
    }
}
