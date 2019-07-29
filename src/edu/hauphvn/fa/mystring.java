package edu.hauphvn.fa;

public class mystring {
    public static void main(String[] args) {
        mystring ss = new mystring();
        System.out.println(ss.toString());

        //Khai bao kieu string pool
        String pool1 = "pool";
        String pool2 = "pool";
        System.out.println(pool1 == pool2);

        String pool3 = new String("pool");
        pool3.intern();
        System.out.println(pool1 == pool3);

    }

    @Override
    public String toString() {
        return "hauphvn";
    }
}
