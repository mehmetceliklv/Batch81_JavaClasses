package day03Odevler;

import java.util.Scanner;

public class Odev05 {

    public static void main(String[] args) {

        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz : Mehmet
        //Soyisminiz : Bulut
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scan.next();

        System.out.println("Soyisminizi giriniz");
        String soyIsim = scan.next();
        System.out.println("Isminiz : " + isim.substring(0, 1).toUpperCase() + isim.substring(1));
        System.out.println("Soyisminiz : " + soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1));
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");
    }
}
