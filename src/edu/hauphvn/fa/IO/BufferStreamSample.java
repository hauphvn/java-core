package edu.hauphvn.fa.IO;

import java.io.*;

public class BufferStreamSample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("Input/hello.txt"));
            pw = new PrintWriter(new FileWriter("Output/hello.txt"));
            String line = null;
            while((line = br.readLine()) != null){
                pw.println(line);
            }
        }finally {
            if(br != null){
                br.close();
            }
            if(pw != null){
                pw.close();
            }
        }
    }
}
