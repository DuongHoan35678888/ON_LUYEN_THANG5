package arrays;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n, temp;
        Scanner input = new Scanner(System.in);

        // neu n < 0 thi phai nhap lai
        do {
            System.out.print("Nhap vao so phan tu cua mang: ");
            n = input.nextInt();
        } while (n < 0);

        // khai bao va cap phat bo nho cho mang
        int array[] = new int[n];

        // nhap gia tri cac phan tu trong mang
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            array[i] = input.nextInt();
        }

        // hien thi mang ban dau
        System.out.println("\nMang ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j >= 1; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        System.out.println("\nMang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
