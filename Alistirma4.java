
public class Alistirma4 {
    public static void main(String[] args){
        double sayi1 = 1.2, sayi2=2.45;
        System.out.println("--değişimden önce--");
        System.out.println("birinci sayı :"+sayi1);
        System.out.println("ikinci sayı :"+sayi2);
        double temp =sayi1;
        sayi1 =sayi2;
        sayi2=temp;
        System.out.println("--değişimden sonra--");
        System.out.println("birinci sayı :"+sayi1);
        System.out.println("ikinci sayı :"+sayi2);

    }
}
