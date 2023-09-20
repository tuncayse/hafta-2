import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println(number + " Asal Bir Sayi Degildir.");
        } else {
            if (isAsal(number, 2)) {
                System.out.println(number + " Asal Bir Sayidir.");
            } else {
                System.out.println(number + " Asal Bir Sayi Degildir.");
            }
        }
    }
    static boolean isAsal(int number, int bölen) {
        if ((bölen * bölen) > number) {
            return true;
        }
        if (number % bölen == 0) {
            return false;
        }
        return isAsal(number, bölen + 1);
    }
}