package Recursion;

public class MergeSort {
    static void main() {
        int[] arr = {2, 4, 3, 6, 1, 5, 8, 9};
        mergeSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }
        mergeSort(a);
        mergeSort(b);
        merge(arr, a, b);
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k++] = b[j++];
            }
        } else {
            while (i < a.length) {
                c[k++] = a[i++];
            }
        }

    }
}