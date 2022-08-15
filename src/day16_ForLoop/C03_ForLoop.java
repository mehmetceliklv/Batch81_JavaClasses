package day16_ForLoop;

public class C03_ForLoop {
    public static void main(String[] args) {

        // Soru 2 ) 20 ile 35 arasindaki(20 ve 35 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin
        int bas=20;
        int son=35;
        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i + ", ");
            }else{
                System.out.print(i);
            }
        }


    }


}
