package day03Odevler;

import java.util.Scanner;

public class Odev01 {

    public static void main(String[] args) {

          //  Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin

            Scanner scan = new Scanner(System.in);
            System.out.println("birinci sayiyi giriniz");
            int a = scan.nextInt();
            System.out.println("birinci sayiyi giriniz");
            int b = scan.nextInt();
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);

    }
}
