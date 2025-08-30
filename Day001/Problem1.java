import java.util.*;

class Problem1 {
    public static int getSecondLargest(int[] arr)
    {
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for(int i = arr.length-2 ; i>=0 ; i--)
        {
            if(arr[i] != largest)
            {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = getSecondLargest(arr);
        System.out.println("Second Largest: " + result);
        sc.close();
    }
}
