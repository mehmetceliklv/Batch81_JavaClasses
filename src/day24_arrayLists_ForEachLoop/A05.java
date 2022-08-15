package day24_arrayLists_ForEachLoop;

import java.util.Arrays;

public class A05 {
    public static void main(String[] args) {
        /*
        Soru 4) Asagidaki multi dimensional array’in
        ic array’lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array’in elemani yapan
        ve yeni array’i ekrana    yazdiran bir program yaziniz

    Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}
         */

        int [][] arr={ {2,4,7}, {9,25}, {6,12} };
        int [] toplam=new int[arr.length];
        int toplam1=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam1+=arr[i][j];
            }
            toplam[i]=toplam1;
            toplam1=0;
        }
        System.out.println(Arrays.toString(toplam));
    }
}
