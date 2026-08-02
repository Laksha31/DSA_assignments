import java.util.Scanner;

public class Day_37_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] pq = new int[100];
        int size = 0;

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equals("insert")) {

                int value = sc.nextInt();

                int j = size - 1;

                while (j >= 0 && pq[j] > value) {
                    pq[j + 1] = pq[j];
                    j--;
                }

                pq[j + 1] = value;
                size++;

            } else if (operation.equals("delete")) {

                if (size == 0) {
                    System.out.println(-1);
                } else {

                    System.out.println(pq[0]);

                    for (int j = 0; j < size - 1; j++) {
                        pq[j] = pq[j + 1];
                    }

                    size--;
                }

            } else if (operation.equals("peek")) {

                if (size == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(pq[0]);
                }
            }
        }

        sc.close();
    }
}