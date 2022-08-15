package day03Odevler;

import java.util.Scanner;

public class Odev03 {

    public static void main(String[] args) {

        //Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        //dairenin çevresi=2*pi*r
        //dairenin alanı=pi*r2


        Scanner scan = new Scanner(System.in);
        System.out.println("dairenin yaricap uzunlugunu giriniz");
        int r = scan.nextInt();
        System.out.println("Dairenin çevresi : " + (2 * 3.14 * r));
        System.out.println("Dairenin alani : " + (3.14 * r * r));
    }
}
