import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int n = scan.nextInt();

        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarini giriniz:");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemani: ");
            dizi[i] = scan.nextInt();
        }

        Arrays.sort(dizi);

        System.out.print("Siralama: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }

    }
}