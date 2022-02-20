import java.util.Scanner;

public class Alistirma2 {
    public static void main(String [] args){
        int sayi1,sayi2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayılar :");
        sayi1= inp.nextInt();
        sayi2=inp.nextInt();
        int sonuc =sayi1 + sayi2;
        System.out.print("Toplam :" + sonuc);



    }
}
