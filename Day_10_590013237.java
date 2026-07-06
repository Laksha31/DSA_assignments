import java.util.Scanner;

public class Day_10_590013237 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int left = 0;
        int right = s.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}