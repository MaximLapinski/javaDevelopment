import java.util.Scanner;
public class gh {
    public static int CountOfGlasn(String s) {
        String etalon = "ЁёУуЕеЫыАаОоЭэЯяИиЮю";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (etalon.indexOf(s.charAt(i)) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String slovo, rez;
        int i = 0, n, probel = 0;
        String[] wor = s.split(" ");

        n = wor.length;
        int[] GlasnSlova = new int[n];
        for (i = 0; i < n; i++) {
            GlasnSlova[i] = CountOfGlasn(wor[i]);
        }
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (GlasnSlova[j] < GlasnSlova[j + 1]) {

                    int a = GlasnSlova[j];
                    GlasnSlova[j] = GlasnSlova[j + 1];
                    GlasnSlova[j + 1] = a;

                    String obm = wor[j];
                    wor[j] = wor[j + 1];
                    wor[j + 1] = obm;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(wor[i] + " ");
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            System.out.print(GlasnSlova[i] + " ");
        }
        System.out.println();
        for (i = 0; i < n; i++) {
        System.out.print(wor[i].substring(0,1).toUpperCase() + wor[i].substring(1).toLowerCase() + " ");
        }
    }
}
