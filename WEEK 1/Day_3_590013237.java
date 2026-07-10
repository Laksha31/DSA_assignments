import java.util.Scanner;
public class Day_3_590013237 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int comparisons = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            comparisons++;
            if (arr[i] == k) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }

        System.out.println("Comparisons = " + comparisons);
        
        sc.close();
    }
}