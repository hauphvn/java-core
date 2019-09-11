package edu.hauphvn.thread;

public class ThreadDemo {
    public static void main(String[] args) {
//        The way: using interface Runnable
//        FristThread fristThread = new FristThread();
//        SecondThread secondThread = new SecondThread();
//
//        Thread thread1 = new Thread(fristThread);
//        thread1.start();
//
//        Thread thread2 = new Thread(secondThread);
//        thread2.start();

//        The way: using class Thread
//        simpleThread simpleThread1 = new simpleThread("HCM");
//        simpleThread simpleThread2 = new simpleThread("DA NANG");
//
//        simpleThread1.start();
//        simpleThread2.start();

//        //Thuc hien 1 job bang nhieu Thread CAch 1: su dung Runnable
//        Thread thread1 = new Thread(new Multi());
//        Thread thread2 = new Thread(new Multi());
//
//        System.out.println(thread1.getName());
//        thread1.start();
//
//        System.out.println(thread1.getName());
//        thread2.start();


        //Thuc hien 1 job bang nhieu Thread CAch 2: extends Thread
//        Multi2 t1 = new Multi2();
//        Multi2 t2 = new Multi2();
//        Multi2 t3 = new Multi2();
//
//            System.out.println(t1.getName());
//            t1.start();
//            System.out.println(t2.getName());
//            t2.start();
//            System.out.println(t3.getName());
//            t3.start();

        //Kiem tra su khac nhau cua class Thread va interface Runnable
        a_ExtendThread a_extendThread = new a_ExtendThread();
        Thread thread = new Thread(new a_ImplementRunnable());

        a_extendThread.start();
        a_extendThread.start();
        thread.start();
        thread.start();


    }

}
