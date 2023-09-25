import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] array = {5, 42, 18, 330, 55, 72, 64, 764, 46, 8, 335, 88, 36, 46, 8, 546, 330, 10, 94, 72, 36};

        Arrays.sort(array);
        System.out.println("Dizi : " + Arrays.toString(array));

        System.out.print("Dizide Tekrar Eden Cift Sayilar : ");
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == array[i - 1] && array[i] % 2 == 0 && array[i] != array[i + 1]) {
                System.out.print(array[i] + " ");

            }

        }

    }

}