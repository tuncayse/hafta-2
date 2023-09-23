import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Dizinin eleman sayisini giriniz: ");
        int n = scan.nextInt();

        int[] list = new int[n];
        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            list[i] = scan.nextInt();
        }
        double sum = 0.0;
        for(int i = 0; i < n; i++) {
            sum += 1.0 / list[i];
        }
        double average = n / sum;
        System.out.println("Harmonik Ortalamasi : " + average);
    }
}