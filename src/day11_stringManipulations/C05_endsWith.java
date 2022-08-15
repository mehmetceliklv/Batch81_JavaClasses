package day11_stringManipulations;

import java.util.Scanner;

public class C05_endsWith {
    public static void main(String[] args) {

        String str="Ah be Java";

        System.out.println(str.endsWith("ava"));
        System.out.println(str.endsWith("be Java"));
        System.out.println(str.endsWith("Ah be Java"));
        System.out.println(str.endsWith(""));


        /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol edin");
        }

    }

    }

