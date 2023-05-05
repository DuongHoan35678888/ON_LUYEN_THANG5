package arrays;

public class QuickSort {
    // ham nhan phan tu cuoi cung lam chot,
    // dat cac phan tu nho hon chot o truoc
    // va lon hon chot o sau no.
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // neu phan tu hien tai nho hon chot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] va arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] va arr[high] (hoac pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // arr[] --> mang can duoc sap xep,
    // low --> chi muc bat dau,
    // high --> chi muc ket thuc
    void sort(int arr[], int low, int high) {
        if (low < high) {
            // pi la chi muc cua chot, arr[pi] vi tri cua chot
            int pi = partition(arr, low, high);

            // sap xep de quy cac phan tu truoc phan vung va sau phan vung
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    // in cac phan tu cua mang
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {10, 23, 9, 66, 93, 4, 34};
        int n = arr.length;

        System.out.println("Mang ban dau: ");
        printArray(arr);

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("\nMang sau khi sap xep: ");
        printArray(arr);
    }
}
