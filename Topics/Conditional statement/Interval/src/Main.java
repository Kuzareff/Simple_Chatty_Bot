import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        if (-15 < i && i <= 12 || 14 < i && i < 17 || i >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}