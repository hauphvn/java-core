package edu.hauphvn.fa.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamSample {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("Input/hello.txt");
            fos = new FileOutputStream("Output/hello.txt");

            int c = 0;//Luu tru 16bit cuoi cung sau khi doc ra
            while((c = fis.read()) != -1){
                fos.write(c);
            }
        }finally {
            if (fis != null){
                fis.close();
            }
            if (fos != null){
                fos.close();
            }
        }


    }
}
