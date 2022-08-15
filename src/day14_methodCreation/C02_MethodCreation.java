package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //Verilen uc basamakli bir sayinin rakamlarini toplayan bir program yaziniz.

        int input=423;

        rakamlariTopla(input);
        C04_MethodCreation.topla(4,5);
        C01_MethodCreation.terstenYazdir("asim");
    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz sayinin rakamlar toplami :"+rakamlarToplami);

    }
}
