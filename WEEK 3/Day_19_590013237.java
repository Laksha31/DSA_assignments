import java.util.Scanner;

public class Day_19_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];
        int second = arr[1];
        int minSum = Math.abs(arr[0] + arr[1]);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int sum = Math.abs(arr[i] + arr[j]);

                if (sum < minSum) {
                    minSum = sum;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }

        System.out.println(first + " " + second);

        sc.close();
    }
}