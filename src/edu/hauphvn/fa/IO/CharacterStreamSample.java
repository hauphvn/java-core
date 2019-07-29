package edu.hauphvn.fa.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamSample {

    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("Input/hello.txt");
            fw = new FileWriter("Output/hello.txt");
            int c = 0;// Luu 8bit cuoi cung sau khi doc ra
            while((c = fr.read()) != -1){
                fw.write(c);
            }

        }finally {
            if(fr != null){
                fr.close();
            }
            if(fw != null){
                fw.close();
            }
        }
    }
}
