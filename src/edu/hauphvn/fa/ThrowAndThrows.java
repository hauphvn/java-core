package edu.hauphvn.fa;

public class ThrowAndThrows {

    public void checkStatus(String message) throws StudentException {

        throw new StudentException(message);
    }

    public static void main(String[] args) throws StudentException {

        ThrowAndThrows throwAndThrows = new ThrowAndThrows();
        throwAndThrows.checkStatus("checkhauphvn");
    }
}
