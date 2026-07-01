import java.util.Scanner;
public class Day_5_590013237 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int[] arr1 = new int[p];

        for (int i = 0; i < p; i++) {
            arr1[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] arr2 = new int[q];

        for (int i = 0; i < q; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        while (i < p && j < q) {
            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

        while (i < p) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        while (j < q) {
            System.out.print(arr2[j] + " ");
            j++;
        }

        sc.close();
    }
}