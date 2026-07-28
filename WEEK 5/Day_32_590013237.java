import java.util.Scanner;

public class Day_32_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            top++;
            stack[top] = sc.nextInt();
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            if (top != -1) {
                top--;
            }
        }

        while (top != -1) {
            System.out.print(stack[top] + " ");
            top--;
        }

        sc.close();
    }
}