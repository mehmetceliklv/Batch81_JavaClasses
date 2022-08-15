package day04_dataCasting;

public class C01_DataCasting {

    public static void main(String[] args) {

        char harf='a';

        char yeniHarf=(char)(harf+1); //kod bu durumda once sagdaki islemi yapar

        System.out.println(yeniHarf);


        int sayi1=(int)7.3;

        double sayi2= 10;
        System.out.println("sayi2 : "+ sayi2);//10.0


        int sayi3='c';
        System.out.println("sayi3 :" +sayi3);//99

        char harf2=98;
        System.out.println("harf2 : " +harf2);//b
    }
}
