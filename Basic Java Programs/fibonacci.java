import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of terms in the Fibonacci Series: ");
        int n = scan.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + n + "terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");

            int nextTerm = a+b;

            a = b;
            b = nextTerm;
        }
    }    
}
