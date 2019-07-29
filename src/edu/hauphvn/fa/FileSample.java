package edu.hauphvn.fa;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSample {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/cmd/myProject/javacore/directoriesSample");
        Files.createDirectories(path);

        Path pathFile = Paths.get("/home/cmd/myProject/javacore/directoriesSample/hello.txt");
        if(!Files.exists(pathFile)){
            Files.createFile(pathFile);
        }else{
            System.out.println("File is existed");
        }

        String str = "Hello everyone";
        byte[] data = str.getBytes();
        OutputStream os = null;

        try {
            os = new BufferedOutputStream(Files.newOutputStream(pathFile,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND));
            os.write(data);
        }finally {
            if(os != null){
                os.close();
            }
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(Files.newBufferedReader(pathFile));
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }finally {
            if(br != null){
                br.close();
            }
        }

        Files.deleteIfExists(pathFile);
        Files.deleteIfExists(path);




    }
}
