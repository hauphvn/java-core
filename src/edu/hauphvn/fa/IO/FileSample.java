package edu.hauphvn.fa.IO;

import java.io.File;
import java.io.IOException;

public class FileSample {

    public static void main(String[] args) throws IOException {

        File dir = new File("Input");
        dir.mkdir();

        File file = new File("Input/input.txt");
        file.createNewFile();
        file.delete();



    }
}
