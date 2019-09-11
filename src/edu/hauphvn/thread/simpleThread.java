package edu.hauphvn.thread;

public class simpleThread extends Thread{

    public simpleThread(String str){
        super(str);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10;i++){
            System.out.println(i+this.getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception "+this.getName()+ e.getMessage());
            }
        }
    }
}
