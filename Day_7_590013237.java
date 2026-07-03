import java.util.*;
public class Day_7_590013237 {
    
       public int fib(int n) {
        int a=0,b=1,c=0;
        if(n==0)
        return a;
        else if(n==1)
        return b;
        else 
        {   c=a+b;
            for(int i=2;i<=n;i++)
            {
            if(i==n)
            break;
            a=b;
            b=c;
            c=a+b;
            }
            return c;
        }
    }
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms: ");
        n = scanner.nextInt();
        Day_7_590013237 obj = new Day_7_590013237();
        System.out.println("The " + n + "th term of the Fibonacci sequence is: " + obj.fib(n));
    }
}
