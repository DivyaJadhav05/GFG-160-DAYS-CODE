import java.util.Scanner;

class Solution {
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // normalize d

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take rotation steps
        System.out.print("Enter number of rotations: ");
        int d = sc.nextInt();

        rotateLeft(arr, d);

        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
