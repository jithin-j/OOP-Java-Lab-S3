import java.util.*;

public class Quick {

    int partition(int a[], int start, int end) {
        int pivot = a[end]; // pivot element
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {

            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }

    void quick(int a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }

    void printArr(int a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int len = arr.length;
        System.out.println("\nBefore sorting array elements are - ");
        Quick q1 = new Quick();
        q1.printArr(arr, len);
        q1.quick(arr, 0, len - 1);
        System.out.println("\nAfter sorting array elements are - ");
        q1.printArr(arr, len);
        System.out.println();
    }
}