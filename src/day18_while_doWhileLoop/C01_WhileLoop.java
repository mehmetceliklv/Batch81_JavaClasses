package day18_while_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

          /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;

        String buyult="";

        while(temp<=sonHarf){
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult + " ");
            temp+=1;
        }

        System.out.println();




        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis harflerini giriniz");
        char ilkHarf1=scan.next().charAt(0);
        char sonHarf1=scan.next().charAt(0);
        String bos="";

        for (char i = ilkHarf1; i <=sonHarf1 ; i++) {
            bos+=(i+" ").toUpperCase();

        }
        System.out.println(bos);
    }
}
