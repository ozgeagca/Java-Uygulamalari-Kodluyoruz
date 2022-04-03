import java.util.Scanner;

public class Alistirma7 {
    public static void main(String[] args) {
        int k;
        Scanner inp =new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        k =inp.nextInt();
        int sayac =0;
        int toplam = 0;

        for(int i = 0 ; i<=k ; i++ ){
            if (i % 3 == 0 && i % 4 ==0 ){
                sayac ++ ;
                toplam = toplam +i ;

            }
        }
        System.out.println("ortalama: " + toplam/sayac);

    }
}
