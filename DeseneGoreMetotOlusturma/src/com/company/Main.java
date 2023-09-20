import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan bir değer alınır
        System.out.print("Bir Sayi Giriniz: ");
        int number = scan.nextInt();
        azalanDesen(number, number);
    }
    static int azalanDesen(int number, int tempNumber) {
        System.out.print(number + " ");
        if(number > 0) {
            number -= 5;
            return azalanDesen(number,tempNumber);
        } else {
            artanDesen(number,tempNumber);
        }
        return 0;
    }
    static int artanDesen(int number,int tempNumber) {
        if(number < tempNumber) {
            number += 5;
            System.out.print(number + " ");
            return artanDesen(number,tempNumber);
        }
        else return number;
    }
}