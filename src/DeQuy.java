import java.util.Scanner;

public class DeQuy {
    private static int giaiThua(int n) {
        if (n > 0) {
            return n * giaiThua(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = input.nextInt();

        System.out.println(n + "! = " + giaiThua(n));
    }
}
