package edu.hauphvn.practice;

import java.util.Scanner;

public class RegEx {
    public void inputInfoStudent(){
        String codePattern = "[A-Z]{5}";
        String passwordPatter = ".{6,}";
        String fullnamePatter = "[a-zA-Z ]+";
        String emailPattern = "\\w+@\\w+(\\. \\w){1,3}";
        String numberPhonePatter = "08[0-9]{8}";// for HCM city
        String idPatter = "\\d{10}";
        String websitePatter = "http://wwww.\\w+\\.\\w{2,4}";

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("\nCode: ");
            input = scanner.nextLine();
        }while (input.matches(codePattern));

        System.out.println("\n\t---------------");

        do {
            System.out.print("\nPassword: ");
            input = scanner.nextLine();
        }while (input.matches(passwordPatter));

        System.out.println("\n\t---------------");

    }
}
