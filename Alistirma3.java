import java.util.Scanner;

public class Alistirma3 {
    public static void main(String[] args) {
        double sayi1, sayi2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin :");
        sayi1 = inp.nextDouble();
        System.out.print("İkinci sayıyı girin :");
        sayi2 = inp.nextDouble();
        double sonuc = sayi1 * sayi2;
        System.out.print("Çarpım sonucu :" + sonuc);
    }
}
