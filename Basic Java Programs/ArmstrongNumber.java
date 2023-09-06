import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the lower bound of the range: ");
        int lower = scan.nextInt();

        System.out.println("Enter the upper bound of the range: ");
        int upper = scan.nextInt();

        System.out.println("Armstrong number between " + lower + " and " + upper);

        for (int num = lower; num <= upper; num++){
            if(isArmstrong(num)){
                System.out.println(num + "");
            }
        }
    }

    public static boolean isArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while(num > 0)
        {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == originalNum;
    }
}