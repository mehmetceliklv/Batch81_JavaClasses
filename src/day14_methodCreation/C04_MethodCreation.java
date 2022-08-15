package day14_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        // verilen isim ve soyismi ilk harfi buyuk
        // geriye kalanlari * olacak sekilde degistirip
        // bize bu halini donduren bir method olusturun
        // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz

        String isim= "Mehmet";
        String soyisim="Celik";

        ismiGizle(isim,soyisim);

        String gizliIsim=ismiGizle(isim,soyisim);
        System.out.println(isim+" "+soyisim);
        System.out.println(gizliIsim);

    }

    public static String ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+soyisim);
;


        return isim+" "+soyisim;
    }


}
