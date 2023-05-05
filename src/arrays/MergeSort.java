package arrays;

public class MergeSort {

    void merge(int arr[], int left, int middle, int right) {
        // tim kich thuoc cua 2 mang con de merge
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // tao mang tam
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy du lieu vao mang tam
        for(int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for(int j = 0; j < n2; ++j)
            R[j] =  arr[middle + 1 + j];

        // merge cac mang con lai

        // chi muc ban dau cua 2 mang con
        int i = 0, j = 0;

        // chi muc ban dau cua mang phu duoc hop nhat
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // sao chep cac phan tu con lai cua L[] neu co
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            // tim diem chinh giua
            int m = (l + r) / 2;

            // ham de quy tiep tuc chia doi
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    // in cac phan tu cua mang
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {7, 34, 67, 88, 9, 12, 55};

        System.out.println("Mang ban dau: ");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nMang sau khi sap xep: ");
        printArray(arr);
    }
}
