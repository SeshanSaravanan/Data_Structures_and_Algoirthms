import java.util.Scanner;

public class largest_number {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number 1: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter the number 2: ");
        double num2 = scan.nextDouble();

        double largestNumber = Math.max(num1, num2);
        System.out.println("The Largest Number is: " + largestNumber);
        
        scan.close();
    }
}
