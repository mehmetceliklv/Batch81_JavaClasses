package day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfElse {

    public static void main(String[] args) {

        /*
        Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
                 Kullanicidan bir sifre girmesini isteyin
                 Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
                 Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
                 Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
                 Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz ");
        String sifre=scan.nextLine();

        if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z') {

            if (sifre.charAt(0) == 'A') {
                System.out.println("Gecerli sifre ");
            }else {
                System.out.println("Gcersiz sifre");
            }

            
        } else if (sifre.charAt(0)>='a'&& sifre.charAt(0)<='z') {

            if (sifre.charAt(0) == 'z') {
                System.out.println("Gecerli sifre ");
            }else {
                System.out.println("Gcersiz sifre");
            }
            
        }else {

            System.out.println("Lutfen ilk karakter icin sadece harf kullanin");
        }
    }
}
