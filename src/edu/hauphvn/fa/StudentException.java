package edu.hauphvn.fa;

public class StudentException extends Exception{

    public StudentException(){

    }

    public StudentException(String message){
        System.out.println("This is a message exception from StudentException: "+ message);
    }
}
