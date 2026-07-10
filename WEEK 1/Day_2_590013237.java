import java.util.Scanner;
public class Day_2_590013237
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}