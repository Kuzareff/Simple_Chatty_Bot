import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int r1 = n * m;
        int r2 = (r1 - k) % 2;
        int nk = (r1 - k) % n;
        int mk = (r1 - k) % m;


        if(k >= n && k < r1 || k >= m && k < r1) {
            if (k == n || k == m || k == r1 - n || k == r1 - m || r2 == 0 || nk == 0 || mk == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}