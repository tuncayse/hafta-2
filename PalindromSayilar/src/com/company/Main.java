import java.util.Scanner;
public class Main {

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10; //temp'in  10'a bölümünden kalan  son basamağı verir.
            reverseNumber = (reverseNumber * 10) + lastNumber; // son basamağı reverseNumber'ın ilk basamağı yaparız.
            temp /= 10; // 10'a bölünür ve kendisine eşitlenirse son basamak silinmiş olur.
        }
        if (reverseNumber == number) {
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int a = scan.nextInt();
        System.out.println(isPalindrom(a));
    }
}
