package edu.hauphvn.fa.NIO2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JavaNIO2 {
    public static void main(String[] args) {
        Path pathFolder = Paths.get("Input/NIO2");
        Path pathFile = Paths.get("Input/NIO2/fileNIO2.txt");
        OutputStream os = null;
        BufferedReader br = null;
        try {
            Files.createDirectories(pathFolder);
            if (!Files.exists(pathFile)){
                Files.createFile(pathFile);

            }else{
                String str = "Jack hauphvn";
                byte[] data = str.getBytes();
                try {
                    os = new BufferedOutputStream(Files.newOutputStream(pathFile,
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND));
                    os.write(data);

                    br = new BufferedReader(Files.newBufferedReader(pathFile));
                    String line = null;
                    while ((line = br.readLine()) != null){
                        System.out.println(line);
                    }
                }finally {
                    if (os != null){
                        os.close();
                    }
                    if (br != null){
                        br.close();
                    }
                }
                System.out.println("File da ton tai");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
