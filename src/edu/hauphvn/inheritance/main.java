package edu.hauphvn.inheritance;

public class main {
    //advance for inheritance
    public static void readArr(int...x){
        for (int num :
                x) {
            System.out.println(num + " , ");
        }
    }

    public static void main(String[] args) {
        int []arrNum = {1,2,3,4,5};
        readArr(arrNum);
    }

}
