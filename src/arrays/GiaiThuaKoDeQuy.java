package arrays;

import java.util.Scanner;

public class GiaiThuaKoDeQuy {
    private static int giaiThua(int n) {
        int giai_Thua = 1;
        if (n == 0 || n == 1){
            return giai_Thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_Thua *= i;
            }
            return giai_Thua;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = input.nextInt();

        System.out.println(n + "!= " + giaiThua(n));
    }
}
