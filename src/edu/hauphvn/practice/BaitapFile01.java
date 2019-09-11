package edu.hauphvn.practice;

import java.io.File;
import java.io.IOException;
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
    public static void main(String[] args) {
        String path = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao duong dan cua file: ");
        path = scanner.nextLine();

        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Tao file moi that bai!");
                e.printStackTrace();
            }
        }
        System.out.println("Size of file: " + file.length());

    }
}
