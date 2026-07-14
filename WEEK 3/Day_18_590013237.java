import java.util.Scanner;

public class Day_18_590013237 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        int k = sc.nextInt();

        // If k is greater than n
        k = k % n;

        int[] rotated = new int[n];

        // Place elements in their new positions
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }

        sc.close();
    }
}