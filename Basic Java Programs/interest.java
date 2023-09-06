import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the principle: ");
        double principle = scan.nextDouble();

        System.out.println("Enter the Number of years: ");
        double time = scan.nextDouble();
        
        System.out.println("Enter the Rate of interest: ");
        double rate = scan.nextDouble();
        
        double interest = ((principle * time * rate) / 100);

        System.out.println("Simple Interest: " + interest);

    }
}
