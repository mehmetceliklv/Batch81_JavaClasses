package day03Odevler;

import java.util.Scanner;

public class Odev02 {

    public static void main(String[] args) {

      //  Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini  hesaplayip yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("karenin kenar uzunlugunu giriniz");
        int a = scan.nextInt();
        System.out.println("Karenin çevresi : " + 4 * a);
        System.out.println("Karenin alani : " + a * a);

    }
}
