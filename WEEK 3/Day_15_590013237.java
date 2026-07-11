import java.util.Scanner;

public class Day_15_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < m && i < n; i++) {
            sum = sum + matrix[i][i];
        }

        System.out.println(sum);

        sc.close();
    }
}