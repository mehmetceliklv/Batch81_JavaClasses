package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {

        //Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin .

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz ");

        int sayi=scan.nextInt();//5267
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        // suanda sayi 5267 bb=0 rt=0

        birlerBasamagi=sayi%10; //7
        rakamlarToplami+=birlerBasamagi; //7
        sayi/=10;//526



        birlerBasamagi=sayi%10;//6
        rakamlarToplami+=birlerBasamagi;//6+7
        sayi/=10;//52


        birlerBasamagi=sayi%10; //2
        rakamlarToplami+=birlerBasamagi;//6+7+2
        sayi/=10;//5

        birlerBasamagi=sayi%10; //5
        rakamlarToplami+=birlerBasamagi; //6+7+2+5
        sayi/=10; //0

        System.out.println("Girilen sayinin rakamlar toplami : "+ rakamlarToplami);

    }
}
