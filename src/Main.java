import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olacak :");
        int n = input.nextInt();
        if (n < 0){
            System.out.println("Hatalı giriş yaptınız. Pozitif bir sayı giriniz!");
        }

        int[] list = new int[n];

        System.out.println("Dizide ki elemanları giriniz :");

        for (int i = 0; i < list.length; i++){
            System.out.print((i + 1) + ". " + "Eleman :");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama :");
        System.out.println(Arrays.toString(list));
    }
}