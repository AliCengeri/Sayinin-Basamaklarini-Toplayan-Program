import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, deger = 0, basamak = 0;
        System.out.print("Sayıyı Giriniz: ");
        a = input.nextInt();
        int a2 = a;
        while (a2 != 0) {
            a2 /= 10;
            basamak++;
        }
        a2 = a;
        while (a2 != 0) {
            c = a2 % 10;
            deger += c;
            a2 /= 10;
        }
        System.out.println("Sayıların Toplamı: " + deger);
    }
}