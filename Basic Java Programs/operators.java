import java.util.Scanner;

public class operators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number 1: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter the character: ");
        char operator = scan.next().charAt(0);

        System.out.println("Enter the Number 2: ");
        double num2 = scan.nextDouble();

        double result = 0.0;

        if (operator == '+')
        {
            result = num1 + num2;
        }
        else if (operator == '-')
        {
            result = num1 - num2;
        }
        else if (operator == '*')
        {
            result = num1 * num2;
        }
        else if (operator == '/')
        {
            result = num1 / num2;
        }

        System.out.println("The Result : " + result);
        
    }    
}
