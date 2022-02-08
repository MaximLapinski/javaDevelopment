import java.util.Scanner;

public class Main {
    public static Boolean INT(double a) {
        if (a == Math.round(a)) {
            return true;
        } else {
            return false;
        }
    }
    public static Boolean Simple(int k) {
        int proverka = 0;
        for (int i = 1; i <= k; i++) {
            if (k % i == 0) {
                proverka++;
            }
        }
        if (proverka <= 2) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b = in.nextDouble();
        if (INT(b)) {
            int a = (int) b;
            for (int i = 1; i <= a; i++) {
                if (Simple(i)) {
                    System.out.println(i + " ");
                }
            }
        } else {
            System.out.println("ERROR : Введенное число не целое.");
        }
    }
}
