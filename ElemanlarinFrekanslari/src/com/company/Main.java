import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] list = {8, 12, 13, 8, 3, 73, 8, 73, 3};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            int say = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == duplicate[j]) {
                    say++;
                }
            }
            int say2 = 0;
            if (say == 0) {
                for (int k = 0; k < list.length; k++) {
                    if (list[i] == list[k]) {
                        say2++;
                    }
                }
                duplicate[startIndex] = list[i];
                startIndex++;
                System.out.println(list[i] + " sayisi : " + say2 + " kere tekrar edildi.");
            }
        }
    }
}