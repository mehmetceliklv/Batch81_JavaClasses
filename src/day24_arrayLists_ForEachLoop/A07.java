package day24_arrayLists_ForEachLoop;

public class A07 {
    public static void main(String[] args) {

        String cumle="her sey cok guzel olacak";

        String reverse="";

        for (int i =cumle.length()-1; i >=0 ; i--) {
            reverse+=cumle.substring(i,i+1);
        }
        System.out.println(reverse);


     /*   System.out.println();

        for (int i = 0; i <cumle.length() ; i++) {
            reverse+=cumle.substring(cumle.length()-i-1,cumle.length()-i);
        }
        System.out.println(reverse);*/
    }
}
