package edu.hauphvn.practice;

import java.io.*;
import java.util.Scanner;

public class BaitapFile01 {
/*
Viet chuong trinh yeu cau nguoi dung nhap vao duong dan cua 1 file. Neu:
File khong ton tai thi tao ra file moi.
Neu file ton tai roi thi:
In ra kich thuoc cua file
Kiem tra file co quyen doc ghi khong
In ra thu muc cha cua file
In ra ngay thang nam gan nhat file duoc chinh sua

* */
    public static void main(String[] args) throws IOException {
//        String path = "";
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao duong dan cua file: ");
//        path = scanner.nextLine();
//
//        File file = new File(path);
//        if (!file.exists()){
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                System.out.println("Tao file moi that bai!");
//                e.printStackTrace();
//            }
//        }
//        System.out.println("Size of file: " + file.length());
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream("Input/hello.txt");
//            int c = 0;
//            while ((c = fis.read())!= -1){
//                System.out.print(Character.toChars(c));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fis != null){
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fos != null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("Input/hello.txt");
            int c = 0;
            while ((c = fr.read())!= -1){
                System.out.print(Character.toChars(c));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null){
                fr.close();
            }
            if (fw != null){
                fw.close();
            }
        }
    }
}
