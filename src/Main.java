import java.util.Scanner;

public class Main {

    static boolean prime(int a) {
        boolean result = true;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + " asal değildir");
                result = false;
                break;
            } else {
                System.out.println(a + " asal sayıdır");
                break;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");
        int n = input.nextInt();

        System.out.println(prime(n));

    }
}
