import java.util.Scanner;

public class TongSoNguyenTo {

    private static boolean kiemTraSoNguyenTo(int n){
        if (n < 2)
            return false;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = input.nextInt();

        if (n < 1000) {
            System.out.println("Cac so nguyen to trong khoang tu 0 - " + n + " la:");
            for (int i = 0; i < n; i++) {
                if (kiemTraSoNguyenTo(i)){
                    sum += i;
                    System.out.println("i= " + i);
                }
            }
            System.out.println("Tong cac so nguyen to trong khoang tu 0 den " + n + " la: " + sum);
        }else {
            System.out.println("Nhap n < 1000");
        }
    }
}
