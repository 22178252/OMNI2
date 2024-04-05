import java.util.Scanner;

public class stepik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef me een getal");
        int getal = scanner.nextInt();
        int getal2 = scanner.nextInt();

        boolean resultaat = methode2(getal, getal2);
        System.out.println("Is het tweede getal een veelvoud van het eerste?" + resultaat);
    }

    public static boolean methode2(int x, int y) {
        if (y % x == 0) {
            return true;
        } else {
            return false;
        }
    }
}

