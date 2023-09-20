import java.util.Scanner;

public class Main {

    // Recursive metot
    static int power(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * power(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz: ");
            int taban = input.nextInt();

            if (taban == 0) {
                break;
            }

            System.out.print("Üs değerini giriniz: ");
            int us = input.nextInt();

            int sonuc = power(taban, us);
            System.out.println("Sonuç: " + sonuc);
        }

    }
}