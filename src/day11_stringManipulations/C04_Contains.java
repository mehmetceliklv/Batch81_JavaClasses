package day11_stringManipulations;

public class C04_Contains {

    public static void main(String[] args) {

        String cumle= "Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();

        if (cumle.contains("buyuk")&& cumle.contains("kucuk")) {

            System.out.println("Karar ver buyuk mu kucuk mu yazdirayim");

        } else if (cumle.contains("kucuk")) {

            System.out.println(cumle.toLowerCase());

        }else if (cumle.contains("buyuk")){

            System.out.println(cumle.toUpperCase());

        }else

            System.out.println("Cumle buyuk ya da kucuk kelimesi icermiyor");
    }
}
