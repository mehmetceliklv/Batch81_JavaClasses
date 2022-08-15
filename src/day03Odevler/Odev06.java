package day03Odevler;

import java.util.Scanner;

public class Odev06 {

    public static void main(String[] args) {

        //Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
        //        sekilde yazdirin
        //Isim – soyisim : Mehmet Bulutluoz

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scan.next();
        System.out.println("Soyisminizi giriniz");
        String soyIsim = scan.next();
        System.out.print("Isim - soyisim : " + isim.substring(0, 1).toUpperCase() + isim.substring(1));
        System.out.print(" " + soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1));

    }
}
