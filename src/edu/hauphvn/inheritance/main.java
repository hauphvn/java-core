package edu.hauphvn.inheritance;

public class main {
    //advance for inheritance
    public static void readArr(int...x){
        for (int num :
                x) {
            System.out.println(num + " , ");
        }
    }

    //static
    static public int X = 200;
    static public void changeX(int a){
        System.out.println("X original: " + X);
        X += a;
        System.out.println("X after: " + X);
    }

    public static void main(String[] args) {
       main objMain = new main();
       objMain.X += 1;
       objMain.X = 0;
       changeX(900);
        System.out.println(X);
    }

}
