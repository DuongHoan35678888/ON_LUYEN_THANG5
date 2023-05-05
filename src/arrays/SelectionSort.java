package arrays;

public class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;

        // duyet qua tung phan tu cua mang
        for (int i = 0; i < n - 1; i++) {
            // tim phan tu nho nhat trong mang chua duoc sap xep
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // hoan doi phan tu nho nhat va phan tu dau tien
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // xuat mang
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();

        int arr[] = {6, 23, 66, 7, 4, 33};
        System.out.println("Mang ban dau:");
        ob.printArray(arr);

        ob.sort(arr);
        System.out.println("\nMang sau khi sap xep: ");
        ob.printArray(arr);
    }
}
