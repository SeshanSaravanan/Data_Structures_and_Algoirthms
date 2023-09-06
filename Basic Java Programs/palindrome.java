import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scan.nextLine();

        input = input.replaceAll("//s+", "").toLowerCase();

        if(ispalindrome(input)){
            System.out.println("The String is a palindrome.");
        }
        else
        {
            System.out.println("The String is not a palindrome.");
        }

    }

    public static boolean ispalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
