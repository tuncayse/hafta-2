import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Dizi oluşturulur.
        int[] list = {10, 12, 78, 0, 56, 101, -2, -33};
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan bir sayı alınır.
        System.out.println("Bir sayi giriniz : ");
        int n = input.nextInt();
        //Dizi küçükten büyüğe sıralanır.
        Arrays.sort(list);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < n && i > min) {
                min = i;
            }
            if (i > n && i < max) {
                max = i;
            }
        }
        //Küçük en yakın sayı bulunur.
        if (min != Integer.MIN_VALUE) {
            System.out.println("Girilen sayidan kucuk en yakin sayi: " + min);
        } else {
            System.out.println("Girilen sayidan kucuk bir sayi bulunamadi.");
        }
        //Büyük en yakın sayı bulunur.
        if (max != Integer.MAX_VALUE) {
            System.out.println("Girilen sayidan buyuk en yakın sayi : " + max);
        } else {
            System.out.println("Girilen sayidan buyuk bir sayi bulunamadi.");
        }

    }
}