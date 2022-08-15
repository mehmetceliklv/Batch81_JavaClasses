package day24_arrayLists_ForEachLoop;

public class A03 {
    public static void main(String[] args) {

        int[][] mda={{1,2,3,4},{5,7,9,0,4},{12,23,43,41,75}};

        for (int i = 0; i < mda.length ; i++) {
            for (int j = 0; j <mda[i].length ; j++) {
                System.out.print(mda[i][j]+" ");
            }
        }

    }
}
