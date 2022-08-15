package day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 7 ) Kullanicidan bir sayi alin
        ve bu sayinin rakamlari toplamini yazdirin
         */
        int input= 5432;
        int rakamlarToplami=0;
        int birlerBasagi=0;
        int temp=input;
        while(temp>0){
            birlerBasagi=temp%10;
            rakamlarToplami += birlerBasagi;
            temp /= 10;
        }
        System.out.println(input + " sayisinin rakamlar toplami : " + rakamlarToplami);


        System.out.println();

        int input1=5432;
        int rakamlarToplami1=0;
        int birlerBasagi1=0;
        int temp1=input1;

        for (int i = 0; i <=4 ; i++) {
            birlerBasagi1=input1%10;
            rakamlarToplami1 += birlerBasagi;
            temp /= 10;


        }
        System.out.println(input1 + " sayisinin rakamlar toplami : " +rakamlarToplami);
    }

}
