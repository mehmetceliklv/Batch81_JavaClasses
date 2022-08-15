package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class A04 {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir array’in boyutunu
        // ve tum elementlerini alarak bir array olusturup,
        // bu array’i bize donduren bir method olusturun


        int[] sonArray=arrayYapMethodu();

        System.out.println(Arrays.toString(sonArray));
    }

    private static int[] arrayYapMethodu() {

        Scanner scan=new Scanner(System.in);

        System.out.println("Kac elemanli bir array olusturmak istersiniz ");
        int arrayElemanSayisi=scan.nextInt();

        int [] yeniArray=new int[arrayElemanSayisi];

        for (int i = 0; i <yeniArray.length ; i++) {
            System.out.println("Lutfen elemanlari yaziniz");
            yeniArray[i]=scan.nextInt();
        }
        return yeniArray;
    }
}
