package day03Odevler;

import java.util.Scanner;

public class Odev04 {
    public static void main(String[] args) {


        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin

        //hacim=a*b*c

        Scanner scan = new Scanner(System.in);
        System.out.println("kisa kenar uzunlugunu giriniz");
        int a = scan.nextInt();
        System.out.println("uzun kenar uzunlugunu giriniz");
        int b = scan.nextInt();
        System.out.println("yukseklik uzunlugunu giriniz");
        int c = scan.nextInt();
        System.out.println("Dikdortgen prizmanin hacmi : " + (a * b * c));





    }

}
