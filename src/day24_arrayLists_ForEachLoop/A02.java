package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {

        // Soru 6: verilen bir arrayde istenen değere eşit olan elemanları
        // kaldırıp, kalanları yeni bir array olarak yazdırın

        Scanner scan = new Scanner(System.in);
        int arr[] = {7, 8, 9, 10, 7, 12, 7, 10, 7, 6, 3, 12, 34, 2, 1};
        System.out.println("Array \'in ilk degeri = " + Arrays.toString(arr));

        System.out.print("Silmek istediginiz degeri giriniz : ");
        int sil = scan.nextInt();

        arr = elemanSil(arr, sil);

        System.out.println("Array \'in son degeri = " + Arrays.toString(arr));
    }

    public static int[] elemanSil(int[] arr, int erase) {
        int silinecekSayi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == erase) {
                silinecekSayi++;
            }
        }
        int[] newArray = new int[arr.length - silinecekSayi];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != erase) {
                newArray[index] = arr[i];
                index++;
            }
        }
        return newArray;

    }
}
