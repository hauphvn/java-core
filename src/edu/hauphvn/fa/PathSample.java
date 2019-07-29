package edu.hauphvn.fa;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {

    public static void main(String[] args) {

        Path path = Paths.get("/home/cmd/myProject/javacore");
        System.out.println(path.getFileName());

        Path pathA = Paths.get("fileA");
        Path pathB = Paths.get("fileB");
        System.out.println(pathA.relativize(pathB));

    }
}
